/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 14/03/2019
Objetivo sucinto da classe: Testar o metodo da classe Papel.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/

package br.com.sankhya.teste;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.sankhya.teatro.Ator;
import br.com.sankhya.teatro.Papel;

public class PapelTeste {
	Ator ator1 = new Ator();
	Papel papel1 = new Papel();
	
	Ator ator2 = new Ator();
	Papel papel2 = new Papel();
	
	@Before
	public void Instancias() {
		ator1.setSalario(new BigDecimal(1600));
		papel1.setAcrescimos(new BigDecimal(400));
		papel1.setAtor(ator1);
		
		ator2.setSalario(new BigDecimal(1606));
		papel2.setAcrescimos(new BigDecimal(3060));
		papel2.setAtor(ator2);
	}

	@Test
	public void TesteSalarioAcrescimo() {
		assertEquals(papel1.exibirSalarioComAcrescimos(), new BigDecimal(2000));
		assertEquals(papel2.exibirSalarioComAcrescimos(), new BigDecimal(4666));
	}
	
}
