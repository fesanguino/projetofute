package com.example.fute.teste;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.fute.entities.Jogador;
import com.example.fute.entities.Selecao;
import com.example.fute.entities.Tecnico;
import com.example.fute.entities.enums.Posicao;
import com.example.fute.repositories.JogadorRepository;
import com.example.fute.repositories.SelecaoRepository;
import com.example.fute.repositories.TecnicoRepository;

@Configuration
public class Teste implements CommandLineRunner {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private SelecaoRepository selecaoRepository;
	@Autowired
	private JogadorRepository jogadorRepository;

	@Override
	public void run(String... args) throws Exception {

		var j1 = new Jogador(null, "Marcelo", 10, Posicao.Atacante);
		var j2 = new Jogador(null, "Felipe", 11, Posicao.Atacante);
		var j3 = new Jogador(null, "Eliesio", 1, Posicao.Goleiro);

		var s1 = new Selecao(null, "Brasil");
		var t1 = new Tecnico(null, "Tele Santana");

		jogadorRepository.saveAll(Arrays.asList(j1, j2, j3));
		selecaoRepository.saveAll(Arrays.asList(s1));
		tecnicoRepository.saveAll(Arrays.asList(t1));

		j1.setSelecao(s1);
		j2.setSelecao(s1);
		j3.setSelecao(s1);

		s1.setTecnico(t1);
		s1.setJogadores(Arrays.asList(j1, j2, j3));

		jogadorRepository.saveAll(Arrays.asList(j1, j2, j3));
		selecaoRepository.saveAll(Arrays.asList(s1));
	}
}
