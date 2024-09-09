package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.BaixaPaciente;
import relatorio.persistence.Conexao;

public class BaixaPacienteDto {
public static ArrayList<BaixaPaciente> baixapacientes(String dataInicial, String dataFinal) {

		ArrayList<BaixaPaciente> baixas = new ArrayList<BaixaPaciente>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  con_numero, prontuario, trg_seq, seqp,data_consulta, cod_status,status_ficha,usuario,data_mvto\r\n"
					+ "FROM agh.v_mam_pac_ficha_baixa\r\n"
					+ "WHERE data_mvto::date between  '" + dataInicial +"' and  '" + dataFinal +"'" ;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				BaixaPaciente baixaPaciente = new BaixaPaciente();
				baixaPaciente.setCon_numero(resultSet.getLong("con_numero"));
				baixaPaciente.setProntuario(resultSet.getLong("prontuario"));
				baixaPaciente.setTrg_seq(resultSet.getLong("trg_seq"));
				baixaPaciente.setSeqp(resultSet.getLong("seqp"));
				baixaPaciente.setData_consulta(resultSet.getString("data_consulta"));
				baixaPaciente.setCod_status(resultSet.getInt("cod_status"));
				baixaPaciente.setStatus_ficha(resultSet.getString("status_ficha"));
				baixaPaciente.setUsuario(resultSet.getString("usuario"));
				baixaPaciente.setData_mvto(resultSet.getString("data_mvto"));
			
			
			
				
			
				baixas.add(baixaPaciente);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return baixas;
		
	}
	
}
