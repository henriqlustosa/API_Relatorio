package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.FichaPaciente;
import relatorio.model.TelaoPS;
import relatorio.persistence.Conexao;

public class TelaoPSDto {
	
public static ArrayList<TelaoPS> telaoPS(String dataInicial, String dataFinal) {
		
		ArrayList<TelaoPS> telas = new ArrayList<TelaoPS>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "WITH RankedData1 AS ( " +
				    "    SELECT " +
				    "        con_numero, " +
				    "        data_consulta, " +
				    "        agenda, " +
				    "        status_ficha, " +
				    "        prontuario, " +
				    "        data_mvto, " +
				    "        nome, " +
				    "        ROW_NUMBER() OVER (PARTITION BY prontuario ORDER BY (data_consulta,data_mvto) DESC) AS rn " + // Changed to PARTITION by prontuario and ORDER by con_numero
				    "    FROM agh.v_mam_pac_ficha " +
				    "    WHERE data_consulta::date BETWEEN '" + dataInicial + "' AND '" + dataFinal + "' " + 
				    "), " +
				    "RankedData2 AS ( " +
				    "    SELECT " +
				    "        prontuario, " +
				    "        descricao, " +
				    "        ROW_NUMBER() OVER (PARTITION BY prontuario ORDER BY data_acolhimento DESC) AS rn " +
				    "    FROM agh.v_mam_pac_acolhimento " +
				    "    WHERE data_acolhimento::date BETWEEN '" + dataInicial + "' AND '" + dataFinal + "' " +
				    "), " +
				    "RankedData3 AS ( " +
				    "    SELECT " +
				    "        cd_prontuario, " +
				    "        nm_nome_social " +
				    "    FROM agh.v_paciente " +
				    ") " +
				    "SELECT " +
				    "    MAX(d1.con_numero) AS con_numero, " +  // Getting the MAX con_numero
				    "    d1.data_consulta, " +
				    "    d1.agenda, " +
				    "    d1.status_ficha, " +
				    "    d1.prontuario, " +
				    "    MAX(d1.data_mvto) AS data_mvto , " +
				    "    d1.nome, " +
				    "    d2.descricao, " +
				    "    pac1.nm_nome_social " +
				    "FROM RankedData1 AS d1 " +
				    "JOIN RankedData2 AS d2 ON d1.prontuario = d2.prontuario " +
				    "JOIN agh.v_paciente AS pac1 ON pac1.cd_prontuario = d1.prontuario " +
				    "WHERE d1.rn = 1 " +  // Ensure we get the top result per partition
				    "AND d2.rn = 1 " +
				    "GROUP BY d1.prontuario, d1.data_consulta, d1.agenda, d1.status_ficha, d1.data_mvto, d1.nome, d2.descricao, pac1.nm_nome_social;";

				
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				TelaoPS telaoPs = new TelaoPS();
				telaoPs.setCon_numero(resultSet.getLong("con_numero"));
				telaoPs.setProntuario(resultSet.getLong("prontuario"));
				telaoPs.setData_consulta(resultSet.getString("data_consulta"));
				telaoPs.setAgenda(resultSet.getString("agenda"));
				telaoPs.setStatus_ficha(resultSet.getString("status_ficha"));
				telaoPs.setData_mvto(resultSet.getString("data_mvto"));
				telaoPs.setNome(resultSet.getString("nome"));
				telaoPs.setDescricao(resultSet.getString("descricao"));
				
				telaoPs.setProntuario(resultSet.getLong("prontuario"));
				
				telaoPs.setNome(resultSet.getString("nome"));
				
				telaoPs.setNm_nome_social(resultSet.getString("nm_nome_social"));
		
				telas.add(telaoPs);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return telas;
}

}
