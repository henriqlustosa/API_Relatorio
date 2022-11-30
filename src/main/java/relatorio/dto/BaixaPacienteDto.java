package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.BaixaPaciente;
import relatorio.persistence.Conexao;

public class BaixaPacienteDto {
public static ArrayList<BaixaPaciente> baixapacientes(String _prontuario) {
		
		ArrayList<BaixaPaciente> baixas = new ArrayList<BaixaPaciente>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  num_consulta, cod_baixa, status, rf,dthr_baixa, observacao\r\n"
					+ "FROM agh.v_mam_pac_ficha_baixa\r\n"
					+ "WHERE data_consulta::date = '" + _prontuario  ;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				BaixaPaciente baixaPaciente = new BaixaPaciente();
				baixaPaciente.setCod_consulta(resultSet.getLong("num_consulta"));
				baixaPaciente.setCod_baixa(resultSet.getLong("cod_baixa"));
				baixaPaciente.setStatus(resultSet.getString("status"));
				baixaPaciente.setRf(resultSet.getLong("rf"));
				baixaPaciente.setDthr_baixa(resultSet.getString("dthr_baixa"));
				baixaPaciente.setObservacao(resultSet.getString("observacao"));
				
			
				baixas.add(baixaPaciente);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return baixas;
		
	}
	
}
