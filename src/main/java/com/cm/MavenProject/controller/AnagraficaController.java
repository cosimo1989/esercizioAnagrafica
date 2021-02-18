package com.cm.MavenProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cm.MavenProject.model.AnagraficaModel;
import com.cm.MavenProject.service.AnagraficaService;


@Controller
public class AnagraficaController {
	
	@Autowired
    public AnagraficaService anagraficaService;

	

	@GetMapping(path ="/listaAnagrafica", produces = "application/json")
	public ResponseEntity<List<AnagraficaModel>> getListaAnagrafica() {
		return ResponseEntity.ok(anagraficaService.getAllanagrafica());
	}
	
	@PostMapping(path ="/saveanagrafica", consumes = "application/json")
	public ResponseEntity<String> saveanagrafica(@RequestBody AnagraficaModel anagrafica) {
		anagraficaService.saveAnagraficaService(anagrafica);;
		return ResponseEntity.ok("OK");
	}
	
}
