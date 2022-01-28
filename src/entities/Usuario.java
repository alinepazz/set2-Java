package entities;

public class Usuario {
	
	private Integer numeroUnico;
	
	public Usuario() {
	}

	public Usuario(Integer numeroUnico) {
		this.numeroUnico = numeroUnico;
	}

	public Integer getNumeroUnico() {
		return numeroUnico;
	}

	public void setNumeroUnico(Integer numeroUnico) {
		this.numeroUnico = numeroUnico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroUnico == null) ? 0 : numeroUnico.hashCode());
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
		Usuario other = (Usuario) obj;
		if (numeroUnico == null) {
			if (other.numeroUnico != null)
				return false;
		} else if (!numeroUnico.equals(other.numeroUnico))
			return false;
		return true;
	}
	
	
	

}
