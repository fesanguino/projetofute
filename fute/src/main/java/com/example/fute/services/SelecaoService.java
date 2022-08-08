package com.example.fute.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fute.entities.Selecao;
import com.example.fute.repositories.SelecaoRepository;

@Service
public class SelecaoService {
	
	@Autowired
	private SelecaoRepository selecaoRepository;
	
	public List<Selecao> findAll(){
		return selecaoRepository.findAll();
	}

}
