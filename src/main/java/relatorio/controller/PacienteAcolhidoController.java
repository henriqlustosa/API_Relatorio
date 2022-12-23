package relatorio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.PacienteAcolhidoDto;
import relatorio.model.PacienteAcolhimento;
@RestController
@RequestMapping("/hspmsgh-api/relatorio/pacientesacolhidos")
public class PacienteAcolhidoController {
	@GetMapping("/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<PacienteAcolhimento>> getPacientePorData(@PathVariable String dataInicial,@PathVariable String dataFinal){
		
		List<PacienteAcolhimento> pacientes = PacienteAcolhidoDto.pacientesAcolhidos(dataInicial, dataFinal);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(pacientes); 
	}

}
