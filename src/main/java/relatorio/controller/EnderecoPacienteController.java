package relatorio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.EnderecoPacienteDto;
import relatorio.model.Endereco;
@RestController
@RequestMapping("/hspmsgh-api/relatorio/enderecofichapacientes")
public class EnderecoPacienteController {
	@GetMapping("/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<Endereco>> getFichaPacientePorData(@PathVariable String dataInicial,@PathVariable String dataFinal){
		
		List<Endereco> fichas = EnderecoPacienteDto.fichaenderecopacientes(dataInicial,dataFinal);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(fichas); 
	}

}
