package relatorio.model;

import java.util.Objects;

public class TelaoPS {
	
	private Long con_numero;
	private Long prontuario;
	private String data_consulta;
	private String agenda;
	private String status_ficha;
	private String data_mvto;
	private String descricao;
	private String nome;
	private String nm_nome_social;
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
	public String getData_consulta() {
		return data_consulta;
	}
	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
	}
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	public String getStatus_ficha() {
		return status_ficha;
	}
	public void setStatus_ficha(String status_ficha) {
		this.status_ficha = status_ficha;
	}
	public String getData_mvto() {
		return data_mvto;
	}
	public void setData_mvto(String data_mvto) {
		this.data_mvto = data_mvto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNm_nome_social() {
		return nm_nome_social;
	}
	public void setNm_nome_social(String nm_nome_social) {
		this.nm_nome_social = nm_nome_social;
	}
	@Override
	public int hashCode() {
		return Objects.hash(agenda, con_numero, data_consulta, data_mvto, descricao, nm_nome_social, nome, prontuario,
				status_ficha);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelaoPS other = (TelaoPS) obj;
		return Objects.equals(agenda, other.agenda) && Objects.equals(con_numero, other.con_numero)
				&& Objects.equals(data_consulta, other.data_consulta) && Objects.equals(data_mvto, other.data_mvto)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(nm_nome_social, other.nm_nome_social)
				&& Objects.equals(nome, other.nome) && Objects.equals(prontuario, other.prontuario)
				&& Objects.equals(status_ficha, other.status_ficha);
	}

	
	

	
	
	
	
	
	
	
	
	
	
	


}
