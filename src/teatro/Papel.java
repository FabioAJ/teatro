/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 12/03/2019
Objetivo sucinto da classe: Manipular dados de um papel.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit
*/

package teatro;

import java.io.Serializable;
import java.math.BigDecimal;

public class Papel implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String nomePersonagem;
	private BigDecimal acrescimos;
	private Ator ator;
	private Peca peca;

	public Papel() {
		super();
	}

	public Papel(Integer ID, String nomePersonagem, BigDecimal acrescimos) {
		this.ID = ID;
		this.nomePersonagem = nomePersonagem;
		this.acrescimos = acrescimos;
	}

	public Integer getID() {
		return ID;
	}
	public void setID(Integer ID) {
		this.ID = ID;
	}
	public String getNomePersonagem() {
		return nomePersonagem;
	}
	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}
	public BigDecimal getAcrescimos() {
		return acrescimos;
	}
	public void setAcrescimos(BigDecimal acrescimos) {
		this.acrescimos = acrescimos;
	}
	
	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}
	
	public Ator getAtor() {
		return ator;
	}

	public void setAtor(Ator ator) {
		this.ator = ator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((acrescimos == null) ? 0 : acrescimos.hashCode());
		result = prime * result + ((nomePersonagem == null) ? 0 : nomePersonagem.hashCode());
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
		Papel other = (Papel) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (acrescimos == null) {
			if (other.acrescimos != null)
				return false;
		} else if (!acrescimos.equals(other.acrescimos))
			return false;
		if (nomePersonagem == null) {
			if (other.nomePersonagem != null)
				return false;
		} else if (!nomePersonagem.equals(other.nomePersonagem))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Papel [ID=" + ID + ", nomePersonagem=" + nomePersonagem + ", acrescimos=" + acrescimos + ", ator="
				+ ator + ", peca=" + peca + "]";
	}

	public BigDecimal exibirSalarioComAcrescimos() {
		return ator.getSalario().add(getAcrescimos());
	}
}
