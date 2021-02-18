package com.cm.MavenProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.MavenProject.model.AnagraficaModel;
import com.cm.MavenProject.repository.AnagraficaRepository;





@Service
public class AnagraficaService  {
	

	@Autowired
	public AnagraficaRepository anagraficaRepository;
	

	
	public List<AnagraficaModel> getAllanagrafica() {
		return  anagraficaRepository.findAll();
	}

	public void saveAnagraficaService(AnagraficaModel anagrafica) {
		anagraficaRepository.save(anagrafica);
	}
	
}