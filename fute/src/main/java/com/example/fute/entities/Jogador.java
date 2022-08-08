package com.example.fute.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.fute.entities.enums.Posicao;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Jogador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer numeroCamisa;
	private Posicao posicao;
	
	// Relacionamento ManyToOne TB_JOGADOR -> TB_SELECAO
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "selecao_id")
	private Selecao selecao;

	public Jogador() {
	}

	public Jogador(Long id, String nome, Integer numeroCamisa, Posicao posicao) {
		this.id = id;
		this.nome = nome;
		this.numeroCamisa = numeroCamisa;
		this.posicao = posicao;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(Integer numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}
	
	public Selecao getSelecao() {
		return selecao;
	}
	
	public void setSelecao(Selecao selecao) {
		this.selecao = selecao;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	
	
}
