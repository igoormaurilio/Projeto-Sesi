package com.sesi.projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.projeto.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
