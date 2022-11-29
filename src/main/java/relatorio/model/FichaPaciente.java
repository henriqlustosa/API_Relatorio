package relatorio.model;


import java.util.Objects;

public class FichaPaciente {
	private Long cod_consulta;
	private String  dt_consulta;
	private String setor;
	private String origem_paciente;
	private String queixa;
	private String info_complementares;
	private String usuario;
	private String  status_ficha;
	private Long prontuario;
	
	public Long getCod_consulta() {
		return cod_consulta;
	}
	public void setCod_consulta(Long cod_consulta) {
		this.cod_consulta = cod_consulta;
	}
	public String getDt_consulta() {
		return dt_consulta;
	}
	public void setDt_consulta(String dt_consulta) {
		this.dt_consulta = dt_consulta;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
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
	public String getInfo_complementares() {
		return info_complementares;
	}
	public void setInfo_complementares(String info_complementares) {
		this.info_complementares = info_complementares;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getStatus_ficha() {
		return status_ficha;
	}
	public void setStatus_ficha(String status_ficha) {
		this.status_ficha = status_ficha;
	}
	public Long getProntuario() {
		return prontuario;
	}
	public void setProntuario(Long prontuario) {
		this.prontuario = prontuario;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod_consulta, setor, dt_consulta, info_complementares, origem_paciente, prontuario,
				queixa, status_ficha, usuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FichaPaciente other = (FichaPaciente) obj;
		return Objects.equals(cod_consulta, other.cod_consulta) && Objects.equals(setor, other.setor)
				&& Objects.equals(dt_consulta, other.dt_consulta)
				&& Objects.equals(info_complementares, other.info_complementares)
				&& Objects.equals(origem_paciente, other.origem_paciente)
				&& Objects.equals(prontuario, other.prontuario) && Objects.equals(queixa, other.queixa)
				&& Objects.equals(status_ficha, other.status_ficha) && Objects.equals(usuario, other.usuario);
	}
	
	
	
	

}
