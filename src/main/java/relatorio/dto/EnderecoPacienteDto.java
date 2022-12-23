package relatorio.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import relatorio.model.Endereco;

import relatorio.persistence.Conexao;

public class EnderecoPacienteDto {
public static ArrayList<Endereco> fichaenderecopacientes(String dataIncial,String dataFinal) {

		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		PreparedStatement preparedStatement;
		try {
			String sqlString = "SELECT  prontuario, logradouro, nro_logradouro, compl_logradouro, bairro,cidade, uf, cep\r\n"
					+ "FROM agh.v_mam_pac_ficha\r\n"
					+ "WHERE data_consulta::date between '" + dataIncial + "' and '"+ dataFinal  +"' GROUP BY prontuario, logradouro, nro_logradouro, compl_logradouro, bairro,cidade, uf, cep" ;
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				Endereco endereco = new Endereco();
				endereco.setProntuario(resultSet.getLong("prontuario"));
				endereco.setTipo_logradouro(resultSet.getString("logradouro"));
				endereco.setNro_logradouro(resultSet.getString("nro_logradouro"));
				endereco.setCompl_logradouro(resultSet.getString("compl_logradouro"));
				endereco.setBairro(resultSet.getString("bairro"));
				endereco.setCidade(resultSet.getString("cidade"));
				endereco.setUf(resultSet.getString("uf"));
				endereco.setCep(resultSet.getString("cep"));
				
				enderecos.add(endereco);

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return enderecos;
		
	}


}
