package com.leilao.anf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leilao.anf.model.Leilao;

public interface LeilaoRepository extends JpaRepository<Leilao, Long> {
   // List<Leilao> findByVeiculoNome(String veiculoNome);
}
