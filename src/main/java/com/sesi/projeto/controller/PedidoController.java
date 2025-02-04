package com.sesi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto.Repositories.PedidoRepository;
import com.sesi.projeto.dto.PedidoDTO;
import com.sesi.projeto.entities.Pedido;

@RestController
@RequestMapping ("Pedido")
public class PedidoController {

	@Autowired
	PedidoRepository repo;
	@GetMapping
	public ResponseEntity<List<Pedido>> mostrarTodos(){
		List<Pedido> prod = repo.findAll();
		return ResponseEntity.ok(prod);
	}
	@GetMapping(value = "/(id)")
	public ResponseEntity<?> mostrarPorId(@PathVariable Long id){
		Pedido prod =repo.getById(id);
		return ResponseEntity.ok(prod);
	}
	@PostMapping
	public ResponseEntity<Pedido> criar(@RequestBody PedidoDTO dto){ 
		Pedido prod = new Pedido(dto);
		return ResponseEntity.ok(prod);
	}
	

}
