/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 14/03/2019
Objetivo sucinto da classe: Testar o metodo da classe Peca.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/

package br.com.sankhya.teste;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.sankhya.teatro.Ator;
import br.com.sankhya.teatro.Papel;
import br.com.sankhya.teatro.Peca;

public class TestePeca {
	Ator ator1 = new Ator();
	Papel papel1 = new Papel();
	Peca peca1 = new Peca();
	
	Ator ator2 = new Ator();
	Papel papel2 = new Papel();
	Peca peca2 = new Peca();
	
	@Before
	public void Instancias() {
		ator1.setSalario(new BigDecimal(1600));
		papel1.setAcrescimos(new BigDecimal(400));
		papel1.setAtor(ator1);
		ator1.getPapeis().addAll(Arrays.asList(papel1));
		peca1.getPapeis().addAll(Arrays.asList(papel1));
		
		ator2.setSalario(new BigDecimal(2060));
		papel2.setAcrescimos(new BigDecimal(606));
		papel2.setAtor(ator2);
		ator2.getPapeis().addAll(Arrays.asList(papel2));
		peca2.getPapeis().addAll(Arrays.asList(papel2));
	}

	@Test
	public void TesteCustoTotal() {
		assertEquals(peca1.exibirCustoTotal(), new BigDecimal(2000));
		assertEquals(peca2.exibirCustoTotal(), new BigDecimal(2666));
	}

}
