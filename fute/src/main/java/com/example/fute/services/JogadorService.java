package com.example.fute.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fute.entities.Jogador;
import com.example.fute.repositories.JogadorRepository;

@Service
public class JogadorService {
    @Autowired
	private JogadorRepository jogadorRepository;

	public List<Jogador> findAll(){
    return jogadorRepository.findAll();

}
}