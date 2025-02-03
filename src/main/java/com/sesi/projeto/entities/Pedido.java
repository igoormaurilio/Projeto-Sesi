package com.sesi.projeto.entities;

import java.time.Instant;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")

public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Instant momento;
	private Status StatusDoPedido;
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
	public Status getStatusDoPedido() {
		return StatusDoPedido;
	}
	public void setStatusDoPedido(Status statusDoPedido) {
		StatusDoPedido = statusDoPedido;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
