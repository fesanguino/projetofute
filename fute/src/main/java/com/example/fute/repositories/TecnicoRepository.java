package com.example.fute.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fute.entities.Tecnico;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Long>{

}
