package teatro;

import java.io.Serializable;
import java.math.BigDecimal;

public class Papel implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String nomePersonagem;
	private BigDecimal acrescimos;
	
	public Papel(Integer iD, String nomePersonagem, BigDecimal acrescimos) {
		super();
		ID = iD;
		this.nomePersonagem = nomePersonagem;
		this.acrescimos = acrescimos;
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
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
	
	
}
