package com.santander.dio.ruth.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santander.dio.ruth.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
}
