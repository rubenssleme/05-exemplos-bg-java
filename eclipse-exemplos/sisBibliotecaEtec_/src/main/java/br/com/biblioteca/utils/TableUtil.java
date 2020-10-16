package br.com.biblioteca.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 * A interface {@link TableModel} define 9 métodos, sendo que 2 deles cuidam da
 * parte de listeners. Esses dois métodos (addTableModelListener e
 * removeTableModelListener) nós delegaremos para a classe
 * {@link AbstractTableModel}. Os outros 7 nós implementaremos. Uma pequena
 * explicação de cada um deles (para mais detalhes, consulte a documentação):<br>
 * <ul>
 * <li>getColumnClass: retorna a classe de determinada coluna. Útil para os
 * renderers saberem como exibir determinada informação.</li>
 * <li>getColumnCount: retorna o número de colunas que nossa tabela terá
 * (geralmente é o número de atributos do objeto que será exibido).</li>
 * <li>getColumnName: retorna o nome da coluna. Será usado no cabeçalho da
 * tabela.</li>
 * <li>getRowCount: retorna o número de registros. Geralmente é a quantidade de
 * elementos que há em nossa lista.</li>
 * <li>getValueAt: retorna o valor que está contido em determinada célula. Para
 * resgatarmos esse valor, primeiro pegamos o objeto da linha e depois, a partir
 * do número da coluna, retornamos uma de suas propriedades.</li>
 * <li>isCellEditable: informa se determinada célula pode ser editada ou não.</li>
 * <li>setValueAt: é chamado quanto o valor de determinada célula é alterada.
 * Devemos modificar nosso objeto para refletir essa mudança.</li>
 * </ul>
 */
public class TableUtil<T> extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	/**
	 * Essa lista armazenará os objetos do tipo {@link Cliente} atualmente
	 * exibidos na tablela.
	 */
	private List<T> objects;
        private String[] colunas;
        private String[] campos;

	// ==============================================================
	// Construtores.
	// ==============================================================

	/**
	 * Constutor que simplesmente instancia o nosso {@link List} que usaremos
	 * para guardar os valores.
	 */
	public TableUtil() {
		// no construtor, instanciamos o List
		objects = new ArrayList<T>();
	}

	/**
	 * Criamos um construtor de conveniência para já popular a lista.
	 * 
	 * @param lista
	 *            a lista de clientes a ser adicionada.
	 */
	public TableUtil(List<T> lista, String[] colunas, String[] campos) {
		this();
                this.colunas = colunas;
                this.campos = campos;
		objects.addAll(lista);
	}

	// ==============================================================
	// Métodos implementados.
	// ==============================================================

	@Override
	public Class<?> getColumnClass(int coluna) {
		// todas as colunas representam uma String
		return String.class;
	}

	@Override
	public int getColumnCount() {
		// esse método deve retornar o número de colunas. No caso, 3 (uma para o
		// nome, uma para o sobrenome e uma para o apelido).
		return colunas.length;
	}

	@Override
	public String getColumnName(int coluna) {	
            return colunas[coluna];
	}

	@Override
	public int getRowCount() {
		// retorna o número de linhas, ou seja, a quantidade de entradas na
		// nossa lista.
		return objects.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
        try {
            colunas = retirarAcentos(colunas);
            Object c = objects.get(linha);
            T classe = (T)c;
            Class noparams[] = {};
            Method metodo = classe.getClass().getDeclaredMethod(campos[coluna], noparams);
            Object ae = metodo.invoke(c, null);
            return ae.toString();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TableUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(TableUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(TableUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(TableUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(TableUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
            return "";
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// nesse caso, todas as células são editáveis
		return false; 
	}

	@Override
	public void setValueAt(Object valor, int linha, int coluna) {
		// aqui devemos atualizar o valor de nossos Clientes
		// vemos em qual linha ele está
		//Object c = generos.get(linha);
		// e vemos o que será atualizado
		/*switch (coluna) {
		case 0:
			//c; // mudamos o nome
			break;
		case 1:
			//c; // mudamos o sobrenome
			break;
		//case 2:
		//	c.setApelido(valor.toString()); // e o apelido
		//	break;
		
		// é importante notificar os listeners a cada alteração
		//fireTableDataChanged();*/
	}

	// ==============================================================
	// Até aqui seria o mínimo necessário para um TableModel funcional, mas
	// ainda não há métodos para adicionar, remover ou resgatar objetos. Vamos
	// criá-los.
	// ==============================================================

	/**
	 * Adiciona um novo {@link Cliente} e notifica os listeners que um novo
	 * registro foi adicionado.
	 */
	public void adiciona() {
		//generos.add(c);
		// informamos os listeners que a linha (size - 1) foi adicionada
		fireTableRowsInserted(objects.size() - 1, objects.size() - 1);
	}

	/**
	 * Similar ao {@link #adiciona(Cliente)}, porém para remover. Recebe o
	 * índice do cliente a ser removido. Se não souber o índice, use o método
	 * {@link #getIndice(Cliente)} antes.
	 */
	public void remove(int indice) {
		objects.remove(indice);
		fireTableRowsDeleted(indice, indice);
	}

	/**
	 * Retorna o índice de determinado cliente.
	 */
	public int getIndice(Class<T> c) {
		return objects.indexOf(c);
	}
        
        public Object getObjeto(){
            return objects;
        }

	/**
	 * Adiciona todos os clientes na lista à este modelo.
	 */
	public void adicionaLista(List<?> lista) {
		int i = objects.size();
		//generos.addAll(lista);
		fireTableRowsInserted(i, i + lista.size());
	}

	/**
	 * Esvazia a lista.
	 */
	public void limpaLista() {
		int i = objects.size();
		objects.clear();
		fireTableRowsDeleted(0, i - 1);
	}
        
        public String[] retirarAcentos(String[] strings)
        {
            for(int i = 0; i < strings.length; i++){
                strings[i] = Normalizer.normalize(strings[i], Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
            }
            return strings;
        }
        
        public Object getObject(int row){
            return objects.get(row);
        }
}
