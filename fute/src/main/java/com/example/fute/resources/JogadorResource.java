package com.example.fute.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fute.entities.Jogador;
import com.example.fute.services.JogadorService;

@RestController
@RequestMapping(value ="/Jogadores")
public class JogadorResource {
	
	@Autowired
	private JogadorService jogadorService;
	
	@GetMapping
	public ResponseEntity<List<Jogador>> findAll(){
		
		List<Jogador> lista=jogadorService.findAll();
		return ResponseEntity.ok().body(lista);
		
	}
	
	
	

}
