package com.sesi.projeto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.projeto.entities.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Long> {

}
