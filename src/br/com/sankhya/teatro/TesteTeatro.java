/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 12/03/2019
Objetivo sucinto da classe: Testar os objetos das classes Peca, Papel e Ator.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/

package br.com.sankhya.teatro;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class TesteTeatro {

	public static void main(String[] args) {
		
		Ator ator1 = new Ator(1, "Fabio", "Bahia", new BigDecimal(1000));
		Ator ator2 = new Ator(2, "Robin", "Japao", new BigDecimal(2400));
		Ator ator3 = new Ator(3, "Mateus", "Chile", new BigDecimal(1000));
		Ator ator4 = new Ator(4, "Jorge", "Africa", new BigDecimal(2400));
		
		Papel papel1 = new Papel(1, "Joao Kleber", new BigDecimal(300));
		Papel papel2 = new Papel(2, "Ricardo Milos", new BigDecimal(600));
		Papel papel3 = new Papel(3, "Fausto Silva", new BigDecimal(250));
		Papel papel4 = new Papel(4, "Tiririca", new BigDecimal(50));
		Papel papel5 = new Papel(5, "Jailson Mendes", new BigDecimal(520));
		
		Peca peca1 = new Peca(1, "A praca e sua", 13, new Date());
		Peca peca2 = new Peca(2, "Pegadinhas do Faustao", 20, new Date());
		
		peca1.getPapeis().addAll(Arrays.asList(papel1, papel2));
		peca2.getPapeis().addAll(Arrays.asList(papel3, papel4, papel5));
		
		papel1.setPeca(peca1);
		papel2.setPeca(peca1);
		papel3.setPeca(peca2);
		papel4.setPeca(peca2);
		papel5.setPeca(peca2);
		
		papel1.setAtor(ator1);
		papel2.setAtor(ator2);
		papel3.setAtor(ator3);
		papel4.setAtor(ator4);
		papel5.setAtor(ator1);
		
		ator1.getPapeis().addAll(Arrays.asList(papel1, papel5));
		ator2.getPapeis().addAll(Arrays.asList(papel2));
		ator3.getPapeis().addAll(Arrays.asList(papel3));
		ator4.getPapeis().addAll(Arrays.asList(papel4));
		
		//Salario com acrescimos
		System.out.println(papel1.exibirSalarioComAcrescimos());
		System.out.println(papel2.exibirSalarioComAcrescimos());
		System.out.println(papel3.exibirSalarioComAcrescimos());
		System.out.println(papel4.exibirSalarioComAcrescimos());
		System.out.println(papel5.exibirSalarioComAcrescimos());
		//Custos totais
		System.out.println(peca1.exibirCustoTotal());
		System.out.println(peca2.exibirCustoTotal());
	}

}
