package com.sesi.projeto.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
	private long id;
	private Instant momento;
	
	@OneToOne
	@MapsId
	private Pedido pedido;
	
	public Pagamento(long id, Instant momento) {
		super();
		this.id = id;
		this.momento = momento;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Instant getMomento() {
		return momento;
	}
	public void setMomento(Instant momento) {
		this.momento = momento;
	}
	
	

}
