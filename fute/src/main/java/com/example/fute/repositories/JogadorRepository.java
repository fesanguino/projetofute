package com.example.fute.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fute.entities.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long>{
	
}
