/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 12/03/2019
Objetivo sucinto da classe: Manipular dados de uma peca.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/

package br.com.sankhya.teatro;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Peca implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String titulo;
	private Integer duracao;
	private Date data;
	private List<Papel> papeis = new ArrayList<>();
	
	public Peca() {
		super();
	}

	public Peca(Integer ID, String titulo, Integer duracao, Date data) {
		super();
		this.ID = ID;
		this.titulo = titulo;
		this.duracao = duracao;
		this.data = data;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((duracao == null) ? 0 : duracao.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peca other = (Peca) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (duracao == null) {
			if (other.duracao != null)
				return false;
		} else if (!duracao.equals(other.duracao))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Peca [ID=" + ID + ", titulo=" + titulo + ", duracao=" + duracao + ", data=" + data + ", papeis="
				+ papeis + "]";
	}

	public BigDecimal exibirCustoTotal() {
		BigDecimal custoTotal = new BigDecimal(0);
		for(Papel papel : papeis) {
			custoTotal = papel.exibirSalarioComAcrescimos().add(custoTotal);
		}
		return custoTotal;
	}
	
	
}
