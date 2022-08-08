package com.example.fute.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fute.entities.Selecao;
import com.example.fute.services.SelecaoService;

@RestController
@RequestMapping(value = "/Selecao")
public class SelecaoResource {
	
	@Autowired
	private SelecaoService selecaoService;
	
	@GetMapping
	public ResponseEntity<List<Selecao>> findAll(){
		
		List<Selecao> lista =selecaoService.findAll();
		return ResponseEntity.ok().body(lista);
		
	}



}
