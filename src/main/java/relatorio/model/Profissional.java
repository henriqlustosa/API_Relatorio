package relatorio.model;

import java.util.Objects;

public class Profissional {
	
	private Long rf_profissional;

	private String nome_profissional;
	private String usuario;
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Long getRf_profissional() {
		return rf_profissional;
	}

	public void setRf_profissional(Long rf_profissional) {
		this.rf_profissional = rf_profissional;
	}

	public String getNome_profissional() {
		return nome_profissional;
	}

	public void setNome_profissional(String nome_profissional) {
		this.nome_profissional = nome_profissional;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome_profissional, rf_profissional, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profissional other = (Profissional) obj;
		return Objects.equals(nome_profissional, other.nome_profissional)
				&& Objects.equals(rf_profissional, other.rf_profissional) && Objects.equals(usuario, other.usuario);
	}




	
	
	

}
