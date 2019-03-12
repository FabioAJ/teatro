/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 12/03/2019
Objetivo sucinto da classe: Testar os objetos das classes Peca, Papel e Ator.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/

package teatro;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class TesteTeatro {

	public static void main(String[] args) {
		Ator ator1 = new Ator(1, "Jorge", "Brasileiro", new BigDecimal(1000));
		Ator ator2 = new Ator(2, "Jorger", "Brazilian", new BigDecimal(2400));
		Papel papel1 = new Papel(1, "Jorgeta", new BigDecimal(100));
		Papel papel2 = new Papel(2, "Jorgin", new BigDecimal(100));
		Peca peca1 = new Peca(1, "Peca dos Jorge", 20, new Date());
		
		peca1.getPapeis().addAll(Arrays.asList(papel1, papel2));		
		papel1.setPeca(peca1);
		papel2.setPeca(peca1);
		papel1.setAtor(ator2);
		papel2.setAtor(ator1);
		ator1.getPapeis().addAll(Arrays.asList(papel2));
		ator2.getPapeis().addAll(Arrays.asList(papel1));
		
		System.out.println(papel1.exibirSalarioComAcrescimos());
		System.out.println(peca1.exibirCustoTotal());
	}

}
