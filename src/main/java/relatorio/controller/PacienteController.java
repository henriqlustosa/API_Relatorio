package relatorio.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.PacienteDto;
import relatorio.model.Paciente;

import java.util.List;
@RestController
@RequestMapping("/hspmsgh-api/relatorio/pacientes")
public class PacienteController {
	@GetMapping("/{prontuarioId}")
	public ResponseEntity<List<Paciente>> getPacientePorData(@PathVariable String prontuarioId){
		
		List<Paciente> pacientes = PacienteDto.pacientes(prontuarioId);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(pacientes); 
	}

}
