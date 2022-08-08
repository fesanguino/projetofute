package com.example.fute.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fute.entities.Tecnico;
import com.example.fute.repositories.TecnicoRepository;


@Service
public class TecnicoService  {
	
    @Autowired
	private TecnicoRepository tecnicoRepository;
	
	public List<Tecnico> findAll(){
		return tecnicoRepository.findAll();
		
	}
}
