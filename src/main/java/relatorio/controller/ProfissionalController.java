package relatorio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.ProfissionalDto;
import relatorio.model.Profissional;
@RestController
@RequestMapping("/hspmsgh-api/relatorio/profissionais")
public class ProfissionalController {
	
	@GetMapping("/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<Profissional>> getProfissionalPorData(@PathVariable String dataInicial,@PathVariable String dataFinal){
		
		List<Profissional> profissionais = ProfissionalDto.profissionais(dataInicial,dataFinal);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(profissionais); 
	}


}
