package relatorio.model;

import java.util.Objects;

public class PacienteAcolhimento {
	
	private Long prontuario;
	private String nomePaciente;
	private String dataNascimento;
	private Long cns;
	private String rg;
	private Long cpf;
	private String sexo;
	private Integer  idade;
	private String raca;
	private String mae;
	private String pai;
	private String email;
	private String tipoPaciente;
	private String rf;
	private String ddd_foneResidencial;
	private String ddd_foneComercial;
	private String ddd_foneRecado;
	private String foneResidencial;
	private String foneComercial;
	private String foneRecado;
	
	public String getDdd_foneResidencial() {
		return ddd_foneResidencial;
	}
	public void setDdd_foneResidencial(String ddd_foneResidencial) {
		this.ddd_foneResidencial = ddd_foneResidencial;
	}
	public String getDdd_foneComercial() {
		return ddd_foneComercial;
	}
	public void setDdd_foneComercial(String ddd_foneComercial) {
		this.ddd_foneComercial = ddd_foneComercial;
	}
	public String getDdd_foneRecado() {
		return ddd_foneRecado;
	}
	public void setDdd_foneRecado(String ddd_foneRecado) {
		this.ddd_foneRecado = ddd_foneRecado;
	}
	public Long getProntuario() {
		return prontuario;
	}
	public void setProntuario(Long prontuario) {
		this.prontuario = prontuario;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Long getCns() {
		return cns;
	}
	public void setCns(Long cns) {
		this.cns = cns;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipoPaciente() {
		return tipoPaciente;
	}
	public void setTipoPaciente(String tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}
	public String getRf() {
		return rf;
	}
	public void setRf(String rf) {
		this.rf = rf;
	}
	public String getFoneResidencial() {
		return foneResidencial;
	}
	public void setFoneResidencial(String foneResidencial) {
		this.foneResidencial = foneResidencial;
	}
	public String getFoneComercial() {
		return foneComercial;
	}
	
	public void setFoneComercial(String foneComercial) {
		this.foneComercial = foneComercial;
	}
	public String getFoneRecado() {
		return foneRecado;
	}
	public void setFoneRecado(String foneRecado) {
		this.foneRecado = foneRecado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cns, cpf, dataNascimento, ddd_foneComercial, ddd_foneRecado, ddd_foneResidencial, email,
				foneComercial, foneRecado, foneResidencial, idade, mae, nomePaciente, pai, prontuario, raca, rf, rg,
				sexo, tipoPaciente);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacienteAcolhimento other = (PacienteAcolhimento) obj;
		return Objects.equals(cns, other.cns) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(ddd_foneComercial, other.ddd_foneComercial)
				&& Objects.equals(ddd_foneRecado, other.ddd_foneRecado)
				&& Objects.equals(ddd_foneResidencial, other.ddd_foneResidencial) && Objects.equals(email, other.email)
				&& Objects.equals(foneComercial, other.foneComercial) && Objects.equals(foneRecado, other.foneRecado)
				&& Objects.equals(foneResidencial, other.foneResidencial) && Objects.equals(idade, other.idade)
				&& Objects.equals(mae, other.mae) && Objects.equals(nomePaciente, other.nomePaciente)
				&& Objects.equals(pai, other.pai) && Objects.equals(prontuario, other.prontuario)
				&& Objects.equals(raca, other.raca) && Objects.equals(rf, other.rf) && Objects.equals(rg, other.rg)
				&& Objects.equals(sexo, other.sexo) && Objects.equals(tipoPaciente, other.tipoPaciente);
	}


	
	

}
