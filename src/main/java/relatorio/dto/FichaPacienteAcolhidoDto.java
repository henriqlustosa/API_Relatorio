package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.FichaPacienteAcolhido;

import relatorio.persistence.Conexao;




public class FichaPacienteAcolhidoDto {
	
	
	public static ArrayList<FichaPacienteAcolhido> fichapacientes(String dataInicial, String dataFinal) {
	ArrayList<FichaPacienteAcolhido> fichas = new ArrayList<FichaPacienteAcolhido>();
	PreparedStatement preparedStatement;
	try {
		String sqlString = "SELECT  prontuario, data_acolhimento, status_ficha, origem_paciente, queixa,informacoes_complementares, usuario_acolhimento, nome, descricao \r\n"
				+ "FROM agh.v_mam_pac_acolhimento\r\n"
				+ "WHERE data_acolhimento::date between '" + dataInicial + "' and '"+ dataFinal + "'" ;
		Connection conn = new Conexao().getConnection();
		preparedStatement = conn.prepareStatement(sqlString);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			
			FichaPacienteAcolhido fichaPaciente = new FichaPacienteAcolhido();
			fichaPaciente.setProntuario(resultSet.getLong("prontuario"));
			fichaPaciente.setData_acolhimento(resultSet.getString("data_acolhimento"));
			fichaPaciente.setStatus_ficha(resultSet.getString("status_ficha"));
			fichaPaciente.setOrigem_paciente(resultSet.getString("origem_paciente"));
			fichaPaciente.setQueixa(resultSet.getString("queixa"));
			fichaPaciente.setInformacoes_complementares(resultSet.getString("informacoes_complementares"));
			fichaPaciente.setUsuario_acolhimento(resultSet.getString("usuario_acolhimento"));
			fichaPaciente.setNome(resultSet.getString("nome"));
			fichaPaciente.setDescricao(resultSet.getString("descricao"));
			
			
				
			fichas.add(fichaPaciente);

		}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return fichas;
	
}

}
