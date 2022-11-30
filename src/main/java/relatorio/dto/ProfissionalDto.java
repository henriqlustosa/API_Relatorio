package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.Profissional;
import relatorio.persistence.Conexao;

public class ProfissionalDto {
public static ArrayList<Profissional> profissionais(String _prontuario) {
		
		ArrayList<Profissional> profissionais = new ArrayList<Profissional>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  rf, nome_profissional\r\n"
					+ "FROM agh.v_mam_pac_ficha_baixa\r\n"
					+ "WHERE data_consulta::date = '" + _prontuario + "' group by rf, nome_profissional " ;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				Profissional profissional = new Profissional();
				profissional.setRf(resultSet.getLong("rf"));
				profissional.setNome_profissional(resultSet.getString("nome_profissional"));
			
				profissionais.add(profissional);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return profissionais;
		
	}
	

}
