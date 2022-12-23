package relatorio.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import relatorio.dto.ProfissionalGuicheDto;
import relatorio.model.ProfissionalGuiche;
@RestController
@RequestMapping("/hspmsgh-api/relatorio/profissionaisguiche")
public class ProfissionalGuicheController {
	@GetMapping("/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<ProfissionalGuiche>> getProfissionalPorData(@PathVariable String dataInicial,@PathVariable String dataFinal){
		
		List<ProfissionalGuiche> profissionais = ProfissionalGuicheDto.profissionais(dataInicial,dataFinal);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(profissionais); 
	}

}
