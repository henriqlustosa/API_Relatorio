package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.FichaPaciente;
import relatorio.persistence.Conexao;

public class FichaPacienteDto {
	
public static ArrayList<FichaPaciente> fichapacientes(String _prontuario) {
		
		ArrayList<FichaPaciente> fichas = new ArrayList<FichaPaciente>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  num_consulta, data_consulta, setor, origem_paciente, queixa,informacoes_complementares, usuario, status_ficha, prontuario\r\n"
					+ "FROM agh.v_mam_pac_ficha\r\n"
					+ "WHERE data_consulta::date = '" + _prontuario + "'" ;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				FichaPaciente fichaPaciente = new FichaPaciente();
				fichaPaciente.setCod_consulta(resultSet.getLong("num_consulta"));
				fichaPaciente.setDt_consulta(resultSet.getString("data_consulta"));
				fichaPaciente.setSetor(resultSet.getString("setor"));
				fichaPaciente.setOrigem_paciente(resultSet.getString("origem_paciente"));
				fichaPaciente.setQueixa(resultSet.getString("queixa"));
				fichaPaciente.setInfo_complementares(resultSet.getString("informacoes_complementares"));
				fichaPaciente.setUsuario(resultSet.getString("usuario"));
				fichaPaciente.setStatus_ficha(resultSet.getString("status_ficha"));
				fichaPaciente.setProntuario(resultSet.getLong("prontuario"));
		
				fichas.add(fichaPaciente);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return fichas;
		
	}

}
