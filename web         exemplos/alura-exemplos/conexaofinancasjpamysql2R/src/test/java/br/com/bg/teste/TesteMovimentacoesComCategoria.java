package br.com.bg.teste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;

import com.mysql.fabric.xmlrpc.base.Array;

import br.com.bg.modelo.Categoria;
import br.com.bg.modelo.Movimentacao;
import br.com.bg.modelo.TipoMovimentacao;
import edu.emory.mathcs.backport.java.util.Arrays;

public class TesteMovimentacoesComCategoria {

	public static void main(String[] args) {

		Categoria categoria1 = new Categoria("Viagem");
		Categoria categoria2 = new Categoria("Negocios");
		
		Movimentacao movimentacao1 = new Movimentacao();
		movimentacao1.setData(Calendar.getInstance());
		movimentacao1.setDescricao("Viagem a SP");
		movimentacao1.setTipo(TipoMovimentacao.SAIDA);
		movimentacao1.setValor(new BigDecimal(200.00));
		//movimentacao1.setCategorias(Arrays.asList(categoria1,categoria2));
		
		
		
		
		
	}

}
