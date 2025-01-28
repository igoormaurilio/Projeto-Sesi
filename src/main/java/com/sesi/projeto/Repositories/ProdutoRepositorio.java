package com.sesi.projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.projeto.entities.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
