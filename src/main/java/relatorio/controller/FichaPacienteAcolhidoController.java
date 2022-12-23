package relatorio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.FichaPacienteAcolhidoDto;
import relatorio.model.FichaPacienteAcolhido;
@RestController
@RequestMapping("/hspmsgh-api/relatorio/fichapacientesacolhidos")
public class FichaPacienteAcolhidoController {
	@GetMapping("/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<FichaPacienteAcolhido>> getFichaPacienteAcolhidoPorData(@PathVariable String dataInicial,@PathVariable String dataFinal){
		
		List<FichaPacienteAcolhido> fichas = FichaPacienteAcolhidoDto.fichapacientes(dataInicial,dataFinal);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(fichas); 
	}
}
