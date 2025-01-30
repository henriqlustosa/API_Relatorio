package relatorio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.TelaoPSDto;
import relatorio.model.TelaoPS;
@RestController
@RequestMapping("/hspmsgh-api/relatorio/telaoPS")
public class TelaoPSController {
	@GetMapping("/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<TelaoPS>> getTelaoPS(@PathVariable String dataInicial,@PathVariable String dataFinal){
		
		List<TelaoPS> fichas = TelaoPSDto.telaoPS(dataInicial,dataFinal);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(fichas); 
	}
}
