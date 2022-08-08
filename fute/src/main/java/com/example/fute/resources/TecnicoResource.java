package com.example.fute.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fute.entities.Tecnico;
import com.example.fute.services.TecnicoService;

@RestController
@RequestMapping(value = "/Tecnicos")
public class TecnicoResource {
	
	@Autowired
	private TecnicoService tecnicoService;
	
	@GetMapping
	public ResponseEntity<List<Tecnico>> findAll(){
		
		List<Tecnico> lista = tecnicoService.findAll();
		return ResponseEntity.ok().body(lista);
		
	}
	

}
