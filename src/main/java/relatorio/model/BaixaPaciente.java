package relatorio.model;

import java.util.Objects;

public class BaixaPaciente {
	
	
	private Long cod_baixa;
	private Long  cod_consulta;
	private String status;
	private Long rf;
	private String dthr_baixa;
	private String observacao;

	public Long getCod_baixa() {
		return cod_baixa;
	}
	public void setCod_baixa(Long cod_baixa) {
		this.cod_baixa = cod_baixa;
	}
	public Long getCod_consulta() {
		return cod_consulta;
	}
	public void setCod_consulta(Long cod_consulta) {
		this.cod_consulta = cod_consulta;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getRf() {
		return rf;
	}
	public void setRf(Long rf) {
		this.rf = rf;
	}
	public String getDthr_baixa() {
		return dthr_baixa;
	}
	public void setDthr_baixa(String dthr_baixa) {
		this.dthr_baixa = dthr_baixa;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod_baixa, cod_consulta, dthr_baixa, rf, observacao, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaixaPaciente other = (BaixaPaciente) obj;
		return Objects.equals(cod_baixa, other.cod_baixa) && Objects.equals(cod_consulta, other.cod_consulta)
				&& Objects.equals(dthr_baixa, other.dthr_baixa)
				&& Objects.equals(rf, other.rf)
				&& Objects.equals(observacao, other.observacao) && Objects.equals(status, other.status);
	}
	

}
