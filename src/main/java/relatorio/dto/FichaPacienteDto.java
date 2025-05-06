package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.FichaPaciente;
import relatorio.persistence.Conexao;

public class FichaPacienteDto {
	
public static ArrayList<FichaPaciente> fichapacientes(String dataInicial, String dataFinal) {
		
		ArrayList<FichaPaciente> fichas = new ArrayList<FichaPaciente>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  con_numero, data_consulta, agenda, origem_paciente, queixa,informacoes_complementares, usuario, status_ficha, prontuario, data_mvto, nome, con_numero_anterior,data_nascimento\r\n"
					+ "FROM agh.v_mam_pac_ficha\r\n"
					+ "WHERE data_consulta::date BETWEEN '" + dataInicial + "'and '" +dataFinal   + "'";
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				FichaPaciente fichaPaciente = new FichaPaciente();
				fichaPaciente.setCod_consulta(resultSet.getLong("con_numero"));
				fichaPaciente.setDt_consulta(resultSet.getString("data_consulta"));
				fichaPaciente.setSetor(resultSet.getString("agenda"));
				fichaPaciente.setOrigem_paciente(resultSet.getString("origem_paciente"));
				fichaPaciente.setQueixa(resultSet.getString("queixa"));
				fichaPaciente.setInfo_complementares(resultSet.getString("informacoes_complementares"));
				fichaPaciente.setUsuario(resultSet.getString("usuario"));
				fichaPaciente.setStatus_ficha(resultSet.getString("status_ficha"));
				fichaPaciente.setProntuario(resultSet.getLong("prontuario"));
				fichaPaciente.setData_mvto(resultSet.getString("data_mvto"));
				fichaPaciente.setNome(resultSet.getString("nome"));
				fichaPaciente.setAnterior(resultSet.getLong("con_numero_anterior"));
				
				fichaPaciente.setData_nascimento(resultSet.getString("data_nascimento"));
				fichas.add(fichaPaciente);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return fichas;
		
	}

}
