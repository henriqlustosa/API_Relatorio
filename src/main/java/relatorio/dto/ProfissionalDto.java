package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.Profissional;
import relatorio.persistence.Conexao;

public class ProfissionalDto {
public static ArrayList<Profissional> profissionais(String dataInicial, String dataFinal) {
		
		ArrayList<Profissional> profissionais = new ArrayList<Profissional>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  rf_profissional, nome_profissional,usuario\r\n"
					+ "FROM agh.v_mam_pac_ficha_baixa\r\n"
					+ "WHERE data_mvto::date  between '" + dataInicial + "' and '"+ dataFinal + "' group by rf_profissional, nome_profissional,usuario " ;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				Profissional profissional = new Profissional();
				profissional.setRf_profissional(resultSet.getLong("rf_profissional"));
				profissional.setNome_profissional(resultSet.getString("nome_profissional"));
				profissional.setUsuario(resultSet.getString("usuario"));
			
				profissionais.add(profissional);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return profissionais;
		
	}
	

}
