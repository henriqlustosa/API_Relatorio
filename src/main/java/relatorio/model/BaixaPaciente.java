package relatorio.model;

import java.util.Objects;

public class BaixaPaciente {
		private Long  prontuario;
		private Long con_numero;
		private Long trg_seq;
		private Long seqp;
		private String data_consulta;
		private Integer cod_status;
		private String status_ficha;
		private String usuario;
		private String data_mvto;
		

	

	public Long getCon_numero() {
		return con_numero;
	}
	public void setCon_numero(Long con_numero) {
		this.con_numero = con_numero;
	}
	public Long getProntuario() {
		return prontuario;
	}
	public void setProntuario(Long prontuario) {
		this.prontuario = prontuario;
	}
	public Long getTrg_seq() {
		return trg_seq;
	}
	public void setTrg_seq(Long trg_seq) {
		this.trg_seq = trg_seq;
	}
	public Long getSeqp() {
		return seqp;
	}
	public void setSeqp(Long seqp) {
		this.seqp = seqp;
	}
	public String getData_consulta() {
		return data_consulta;
	}
	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
	}
	public Integer getCod_status() {
		return cod_status;
	}
	public void setCod_status(Integer cod_status) {
		this.cod_status = cod_status;
	}
	public String getStatus_ficha() {
		return status_ficha;
	}
	public void setStatus_ficha(String status_ficha) {
		this.status_ficha = status_ficha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getData_mvto() {
		return data_mvto;
	}
	public void setData_mvto(String data_mvto) {
		this.data_mvto = data_mvto;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod_status, con_numero, data_consulta, data_mvto, prontuario, seqp, status_ficha, trg_seq,
				usuario);
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
		return Objects.equals(cod_status, other.cod_status) && Objects.equals(con_numero, other.con_numero)
				&& Objects.equals(data_consulta, other.data_consulta) && Objects.equals(data_mvto, other.data_mvto)
				&& Objects.equals(prontuario, other.prontuario) && Objects.equals(seqp, other.seqp)
				&& Objects.equals(status_ficha, other.status_ficha) && Objects.equals(trg_seq, other.trg_seq)
				&& Objects.equals(usuario, other.usuario);
	}
	
	


	
	

}
