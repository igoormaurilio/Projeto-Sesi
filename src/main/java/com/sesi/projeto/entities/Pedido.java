package com.sesi.projeto.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")

public class Pedido {
	
	@OneToMany(mappedBy ="id.pedido")
	private Set<ItemDoPedido>items =new HashSet<>();
	public Set <ItemDoPedido>getItems(){
		
		return items;
	}
	public List<Produto>getProduto(){
		return items.stream().map(x ->x.getProduto()).toList();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Instant momento;
	private Status StatusDoPedido;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Usuario cliente;
	
	@OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
	
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
