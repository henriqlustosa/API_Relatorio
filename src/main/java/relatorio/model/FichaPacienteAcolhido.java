package relatorio.model;

import java.util.Objects;

public class FichaPacienteAcolhido {
	private Long prontuario;
	private String  data_acolhimento;
	private String status_ficha;
	private String origem_paciente;
	private String queixa;
	private String informacoes_complementares;
	private String usuario_acolhimento;
	private String nome;
	public Long getProntuario() {
		return prontuario;
	}
	public void setProntuario(Long prontuario) {
		this.prontuario = prontuario;
	}
	public String getData_acolhimento() {
		return data_acolhimento;
	}
	public void setData_acolhimento(String data_acolhimento) {
		this.data_acolhimento = data_acolhimento;
	}
	public String getStatus_ficha() {
		return status_ficha;
	}
	public void setStatus_ficha(String status_ficha) {
		this.status_ficha = status_ficha;
	}
	public String getOrigem_paciente() {
		return origem_paciente;
	}
	public void setOrigem_paciente(String origem_paciente) {
		this.origem_paciente = origem_paciente;
	}
	public String getQueixa() {
		return queixa;
	}
	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}
	public String getInformacoes_complementares() {
		return informacoes_complementares;
	}
	public void setInformacoes_complementares(String informacoes_complementares) {
		this.informacoes_complementares = informacoes_complementares;
	}
	public String getUsuario_acolhimento() {
		return usuario_acolhimento;
	}
	public void setUsuario_acolhimento(String usuario_acolhimento) {
		this.usuario_acolhimento = usuario_acolhimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data_acolhimento, informacoes_complementares, nome, origem_paciente, prontuario, queixa,
				status_ficha, usuario_acolhimento);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FichaPacienteAcolhido other = (FichaPacienteAcolhido) obj;
		return Objects.equals(data_acolhimento, other.data_acolhimento)
				&& Objects.equals(informacoes_complementares, other.informacoes_complementares)
				&& Objects.equals(nome, other.nome) && Objects.equals(origem_paciente, other.origem_paciente)
				&& Objects.equals(prontuario, other.prontuario) && Objects.equals(queixa, other.queixa)
				&& Objects.equals(status_ficha, other.status_ficha)
				&& Objects.equals(usuario_acolhimento, other.usuario_acolhimento);
	}
	


}
