package br.com.rubensleme.projetoFormatadorNome;

import org.junit.Test;

import br.com.rubensleme.projetoFormatadorNome.dominio.Autoridade;
import br.com.rubensleme.projetoFormatadorNome.dominio.Sexo;
import br.com.rubensleme.projetoFormatadorNome.formatos.ComTitulo;
import br.com.rubensleme.projetoFormatadorNome.formatos.Informal;
import br.com.rubensleme.projetoFormatadorNome.formatos.Respeitoso;
import junit.framework.Assert;

public class TestesAutoridade {

	/*
	 * Instruções
	 * 
	 * Crie uma interface chamada FormatadorNome que possui o método String
	 * formatarNome(String nome, String sobrenome).
	 * 
	 * Crie uma classe chamada Autoridade que possui atributos como nome,
	 * sobrenome e uma instância de FormatadorNome. Essa classe deve possuir um
	 * método getTratamento() que delega a formatação do nome para a instância
	 * de FormatadorNome.
	 * 
	 * Crie as seguintes implementações da interface FormatadorNome:
	 * 
	 * Informal: retorna somente o primeiro nome
	 * 
	 * Respeitoso: deve receber em seu construtor a informação se é masculino ou
	 * feminino, e retornar "Sr." ou "Sra." seguido do sobrenome.
	 * 
	 * ComTítulo: deve receber em seu construtor o título e retornar o título
	 * seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral".
	 * 
	 * Crie testes de unidade que fazem os testes da classe Autoridade com cada
	 * uma das implementações da interface.
	 * 
	 * Review criteriamenos Serão verificados se os itens pedidos no enunciado
	 * foram cumpridos. Procure entregar um código organizado pois isso também
	 * será avaliado.
	 * 
	 * Testes: 	  
	 * 		TesteInformal: 
	 * 			1. Verifica o retorno do nome formatado [OK]
	 * 		TesteRespeitoso: 
	 * 			2. Verifica o Nome formatado [OK] 
	 * 				2.a Sexo Masculino [OK] 
	 * 				2.b Sexo Feminino [OK] 
	 * 		TesteComTitulo: 
	 * 			3. Verifica o retorno do nome formatado com titulo. [OK]
	 */

	@Test
	public void testes_verifica_se_formatador_formata_nome_com_tratamento_informal() {
		String nome = "Carlos";
		String sobrenome = "Kafka";

		Autoridade autoridade = new Autoridade(nome, sobrenome, new Informal());

		Assert.assertEquals(autoridade.getTratamento(), nome);
	}

	@Test
	public void testes_verifica_se_formatador_formata_nome_com_tratamento_com_titulo() {
		String nome = "Carlos";
		String sobrenome = "Kafka";
		String titulo = "Desenvolvedor Java";
		String nomeComTituloFormatado = "Desenvolvedor Java Carlos Kafka";

		Autoridade autoridade = new Autoridade(nome, sobrenome, new ComTitulo(titulo));

		Assert.assertEquals(autoridade.getTratamento(), nomeComTituloFormatado);
	}

	@Test
	public void testes_verifica_se_formatador_formata_nome_com_tratamento_respeitoso_com_sexo_masculino() {
		String nome = "Carlos";
		String sobrenome = "Kafka";
		Sexo sexo = Sexo.MASCULINO;
		String nomeRespeitosoFormatado = "Sr. Kafka";

		Autoridade autoridade = new Autoridade(nome, sobrenome, new Respeitoso(sexo));

		Assert.assertEquals(autoridade.getTratamento(), nomeRespeitosoFormatado);
	}

	@Test
	public void testes_verifica_se_formatador_formata_nome_com_tratamento_respeitoso_com_sexo_feminino() {
		String nome = "Luciana";
		String sobrenome = "Silva";
		Sexo sexo = Sexo.FEMININO;
		String nomeRespeitosoFormatado = "Sra. Silva";

		Autoridade autoridade = new Autoridade(nome, sobrenome, new Respeitoso(sexo));

		Assert.assertEquals(autoridade.getTratamento(), nomeRespeitosoFormatado);
	}
}
