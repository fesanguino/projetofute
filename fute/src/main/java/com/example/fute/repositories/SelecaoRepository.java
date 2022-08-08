package com.example.fute.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fute.entities.Selecao;

@Repository
public interface SelecaoRepository  extends JpaRepository<Selecao, Long>{

}
