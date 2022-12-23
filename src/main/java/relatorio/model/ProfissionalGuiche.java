package relatorio.model;

import java.util.Objects;

public class ProfissionalGuiche {


	private String usuario_acolhimento;

	
	private String nome_profissional;
	
	public String getUsuario_acolhimento() {
		return usuario_acolhimento;
	}

	public void setUsuario_acolhimento(String usuario_acolhimento) {
		this.usuario_acolhimento = usuario_acolhimento;
	}

	public String getNome_profissional() {
		return nome_profissional;
	}

	public void setNome_profissional(String nome_profissional) {
		this.nome_profissional = nome_profissional;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome_profissional, usuario_acolhimento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfissionalGuiche other = (ProfissionalGuiche) obj;
		return Objects.equals(nome_profissional, other.nome_profissional)
				&& Objects.equals(usuario_acolhimento, other.usuario_acolhimento);
	}
	

}
