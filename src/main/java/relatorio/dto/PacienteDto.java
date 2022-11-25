package relatorio.dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import relatorio.model.Paciente;
import relatorio.persistence.Conexao;
import java.util.ArrayList;
public class PacienteDto {
	
	public static ArrayList<Paciente> pacientes(String _prontuario) {
		
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  prontuario, nome_paciente, data_nascimento, cns, rg, cpf, sexo , idade, raça, nome_mae, nome_pai, responsavel, email, tipo_paciente, rf, fone_residencial, fone_comercial, fone_recado\r\n"
					+ "FROM agh.v_mam_pac_ficha\r\n"
					+ "WHERE data_consulta::date = '" + _prontuario + "' group by prontuario, nome_paciente, data_nascimento, cns, rg, cpf, sexo , idade, raça, nome_mae, nome_pai, responsavel, email, tipo_paciente, rf, fone_residencial, fone_comercial, fone_recado " ;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				Paciente paciente = new Paciente();
				paciente.setProntuario(resultSet.getLong("prontuario"));
				paciente.setNomePaciente(resultSet.getString("nome_paciente"));
				paciente.setDataNascimento(resultSet.getString("data_nascimento"));
				paciente.setCns(resultSet.getLong("cns"));
				paciente.setRg(resultSet.getString("rg"));
				paciente.setCpf(resultSet.getLong("cpf"));
				paciente.setSexo(resultSet.getString("sexo"));
				paciente.setIdade(resultSet.getInt("idade"));
				paciente.setRaca(resultSet.getString("raça"));
				paciente.setMae(resultSet.getString("nome_mae"));
				paciente.setPai(resultSet.getString("nome_pai"));
				paciente.setResponsavel(resultSet.getString("responsavel"));
				paciente.setEmail(resultSet.getString("email"));
				paciente.setTipoPaciente(resultSet.getString("tipo_paciente"));
				paciente.setRf(resultSet.getInt("rf"));
				paciente.setFoneResidencial(resultSet.getString("fone_residencial"));
				paciente.setFoneComercial(resultSet.getString("fone_comercial"));
				paciente.setFoneRecado(resultSet.getString("fone_recado"));
				pacientes.add(paciente);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pacientes;
		
	}
	
	
	
	

}
