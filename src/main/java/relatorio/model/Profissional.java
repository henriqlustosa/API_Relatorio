package relatorio.model;

import java.util.Objects;

public class Profissional {
	private Long rf;
	public Long getRf() {
		return rf;
	}
	public void setRf(Long rf) {
		this.rf = rf;
	}
	public String getNome_profissional() {
		return nome_profissional;
	}
	public void setNome_profissional(String nome_profissional) {
		this.nome_profissional = nome_profissional;
	}
	private String nome_profissional;
	@Override
	public int hashCode() {
		return Objects.hash(nome_profissional, rf);
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
		return Objects.equals(nome_profissional, other.nome_profissional) && Objects.equals(rf, other.rf);
	}

}
