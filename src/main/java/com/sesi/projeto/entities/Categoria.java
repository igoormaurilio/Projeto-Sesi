package com.sesi.projeto.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")

public class Categoria {
	private long id;
	private String nome;
	
	@ManyToMany(mappedBy = "categorias")
	private Set<Produto> produtos = new HashSet<>();
	
	public Categoria(long id, String nome) {
		
		
		super();
		this.id = id;
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
