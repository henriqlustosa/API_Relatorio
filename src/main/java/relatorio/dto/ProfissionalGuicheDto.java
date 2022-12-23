package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.ProfissionalGuiche;
import relatorio.persistence.Conexao;

public class ProfissionalGuicheDto {
public static ArrayList<ProfissionalGuiche> profissionais(String dataInicial, String dataFinal) {
		
		ArrayList<ProfissionalGuiche> profissionais = new ArrayList<ProfissionalGuiche>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  usuario_acolhimento, nome_profissional\r\n"
					+ "FROM agh.v_mam_pac_acolhimento\r\n"
					+ "WHERE data_acolhimento::date between '" + dataInicial + "'and '" + dataFinal + "' group by usuario_acolhimento, nome_profissional " ;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			 
			while (resultSet.next()) {
				
				ProfissionalGuiche profissional = new ProfissionalGuiche();
				profissional.setUsuario_acolhimento(resultSet.getString("usuario_acolhimento"));
				profissional.setNome_profissional(resultSet.getString("nome_profissional"));
			
				profissionais.add(profissional);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return profissionais;
		
	}
}
