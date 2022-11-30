package relatorio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.BaixaPacienteDto;
import relatorio.model.BaixaPaciente;
@RestController
@RequestMapping("/hspmsgh-api/relatorio/baixapacientes")
public class BaixaPacienteController {
	@GetMapping("/{prontuarioId}")
	public ResponseEntity<List<BaixaPaciente>> getBaixaPacientePorData(@PathVariable String prontuarioId){
		
		List<BaixaPaciente> baixas = BaixaPacienteDto.baixapacientes(prontuarioId);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(baixas); 
	}

}
