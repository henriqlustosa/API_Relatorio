package relatorio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.EnderecoPacienteAcolhidoDto;

import relatorio.model.Endereco;
@RestController
@RequestMapping("/hspmsgh-api/relatorio/enderecofichapacientesacolhidos")
public class EnderecoPacienteAcolhidoController {
	@GetMapping("/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<Endereco>> getFichaPacientePorData(@PathVariable String dataInicial,@PathVariable String dataFinal){
		
		List<Endereco> fichas = EnderecoPacienteAcolhidoDto.fichaenderecopacientesacolhidos(dataInicial,dataFinal);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(fichas); 
	}

}
