package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.PacienteAcolhimento;
import relatorio.persistence.Conexao;

public class PacienteAcolhidoDto {
	
public static ArrayList<PacienteAcolhimento> pacientesAcolhidos(String dataInicial, String dataFinal) {
		
		ArrayList<PacienteAcolhimento> pacientes = new ArrayList<PacienteAcolhimento>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  prontuario, nome, data_nascimento, cns, rg, cpf, sexo , idade, raca, nome_mae, nome_pai, email, tipo_paciente, rf_paciente,ddd_fone_residencial ,fone_residencial,ddd_fone_comercial, fone_comercial,ddd_fone_recado, fone_recado\r\n"
					+ "FROM agh.v_mam_pac_acolhimento\r\n"
					+ "WHERE data_acolhimento::date between '" + dataInicial + "'and '" +dataFinal +  "' group by prontuario, nome, data_nascimento, cns, rg, cpf, sexo , idade, raca, nome_mae, nome_pai, email, tipo_paciente, rf_paciente,ddd_fone_residencial ,fone_residencial,ddd_fone_comercial, fone_comercial,ddd_fone_recado, fone_recado " ;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
		
			while(resultSet.next()) {
		
			
				PacienteAcolhimento paciente = new PacienteAcolhimento();
				paciente.setProntuario(resultSet.getLong("prontuario"));
				paciente.setNomePaciente(resultSet.getString("nome"));
				paciente.setDataNascimento(resultSet.getString("data_nascimento"));
				paciente.setCns(resultSet.getLong("cns"));
				paciente.setRg(resultSet.getString("rg"));
				paciente.setCpf(resultSet.getLong("cpf"));
				paciente.setSexo(resultSet.getString("sexo"));
				paciente.setIdade(resultSet.getInt("idade"));
				paciente.setRaca(resultSet.getString("raca"));
				paciente.setMae(resultSet.getString("nome_mae"));
				paciente.setPai(resultSet.getString("nome_pai"));
				paciente.setEmail(resultSet.getString("email"));
				paciente.setTipoPaciente(resultSet.getString("tipo_paciente"));
				

		
				paciente.setRf(resultSet.getString("rf_paciente") != null ? resultSet.getString("rf_paciente").replaceAll("[^0-9]", ""): "0");
				paciente.setDdd_foneResidencial(resultSet.getString("ddd_fone_residencial"));
				paciente.setFoneResidencial(resultSet.getString("fone_residencial"));
				paciente.setDdd_foneComercial(resultSet.getString("ddd_fone_comercial"));
				paciente.setFoneComercial(resultSet.getString("fone_comercial"));
				paciente.setDdd_foneRecado(resultSet.getString("ddd_fone_recado"));
				paciente.setFoneRecado(resultSet.getString("fone_recado"));
				pacientes.add(paciente);
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pacientes;
		
	}
	

}
