package com.santander.dio.ruth.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santander.dio.ruth.banklineapi.model.Movimentacao;

import java.util.List;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

	public List<Movimentacao>findByIdConta(Integer idConta);
}

