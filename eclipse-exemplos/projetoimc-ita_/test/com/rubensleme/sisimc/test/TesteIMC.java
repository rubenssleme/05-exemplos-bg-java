package com.rubensleme.sisimc.test;



import org.junit.Assert;
import org.junit.Test;

import com.rubensleme.sisimc.Classificacao;
import com.rubensleme.sisimc.Paciente;
public class TesteIMC {

	@Test
	public void testeVerificaImcABaixoDeDesesseis() {
			Paciente p = new Paciente(43.00,167.50);
			Assert.assertEquals(p.calculaIMC(), Classificacao.BAIXO_PESO_MUITO_GRAVE);
	}
	@Test
	public void testeVerificaImcEstaEntreDezesseisEDezessete() {
				Paciente p = new Paciente(45.00,167.50);
				Assert.assertEquals(p.calculaIMC(), Classificacao.BAIXO_PESO_GRAVE);
	}
	
	@Test
	public void testeVerificaImcEstaEntredDezesseteEDezoito() {
				Paciente p = new Paciente(50.00,167.50);
				Assert.assertEquals(p.calculaIMC(), Classificacao.BAIXO_PESO);
	}
	@Test
	public void testeVerificaImcEstaEntredDezoitoEVinteCinco() {
				Paciente p = new Paciente(55.00,167.50);
				Assert.assertEquals(p.calculaIMC(), Classificacao.PESO_NORMAL);
	}	
	@Test
	public void testeVerificaImcEstaEntredVinteCincoETrinta() {
				Paciente p = new Paciente(80.00,167.50);
				Assert.assertEquals(p.calculaIMC(), Classificacao.SOBREPESO);
	}	
	@Test
	public void testeVerificaImcEstaEntredTrintaETrintaCinco() {
				Paciente p = new Paciente(85.00,167.50);
				Assert.assertEquals(p.calculaIMC(), Classificacao.OBESIDADE_GRAU_I);
	}	
	@Test
	public void testeVerificaImcEstaEntredTrintaCincoEQuarenta() {
				Paciente p = new Paciente(100.00,167.50);
				Assert.assertEquals(p.calculaIMC(), Classificacao.OBESIDADE_GRAU_II);
	}	
	@Test
	public void testeVerificaImcEstaEntredQuarentaECem() {
				Paciente p = new Paciente(150.00,167.50);
				Assert.assertEquals(p.calculaIMC(), Classificacao.OBESIDADE_GRAU_III);
	}	

}
