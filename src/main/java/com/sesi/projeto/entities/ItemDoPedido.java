package com.sesi.projeto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item")
public class ItemDoPedido {
	private Integer quantidade;
	private Double preco;
	public ItemDoPedido(Integer quantidade, Double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	

}

