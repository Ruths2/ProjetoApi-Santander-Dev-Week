package com.santander.dio.ruth.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santander.dio.ruth.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
}
