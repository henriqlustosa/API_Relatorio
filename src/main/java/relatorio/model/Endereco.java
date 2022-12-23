package relatorio.model;

import java.util.Objects;

public class Endereco {
	
	private Long prontuario;
	private String  tipo_logradouro;
	private String nro_logradouro;
	private String compl_logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	private String  cep;
	public Long getProntuario() {
		return prontuario;
	}
	public void setProntuario(Long prontuario) {
		this.prontuario = prontuario;
	}
	public String getTipo_logradouro() {
		return tipo_logradouro;
	}
	public void setTipo_logradouro(String tipo_logradouro) {
		this.tipo_logradouro = tipo_logradouro;
	}
	public String getNro_logradouro() {
		return nro_logradouro;
	}
	public void setNro_logradouro(String nro_logradouro) {
		this.nro_logradouro = nro_logradouro;
	}
	public String getCompl_logradouro() {
		return compl_logradouro;
	}
	public void setCompl_logradouro(String compl_logradouro) {
		this.compl_logradouro = compl_logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, compl_logradouro, nro_logradouro, prontuario, tipo_logradouro, uf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(compl_logradouro, other.compl_logradouro)
				&& Objects.equals(nro_logradouro, other.nro_logradouro) && Objects.equals(prontuario, other.prontuario)
				&& Objects.equals(tipo_logradouro, other.tipo_logradouro) && Objects.equals(uf, other.uf);
	}


}
