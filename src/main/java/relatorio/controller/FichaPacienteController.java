package relatorio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.FichaPacienteDto;
import relatorio.model.FichaPaciente;

@RestController
@RequestMapping("/hspmsgh-api/relatorio/fichapacientes")
public class FichaPacienteController {
	@GetMapping("/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<FichaPaciente>> getFichaPacientePorData(@PathVariable String dataInicial,@PathVariable String dataFinal){
		
		List<FichaPaciente> fichas = FichaPacienteDto.fichapacientes(dataInicial,dataFinal);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(fichas); 
	}

}
