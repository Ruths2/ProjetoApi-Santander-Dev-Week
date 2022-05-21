package com.santander.dio.ruth.banklineapi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.dio.ruth.banklineapi.dto.NovoCorrentista;
import com.santander.dio.ruth.banklineapi.model.Conta;
import com.santander.dio.ruth.banklineapi.model.Correntista;
import com.santander.dio.ruth.banklineapi.repository.CorrentistaRepository;

@Service
public class CorrentistaService {

  @Autowired
	private CorrentistaRepository repository;

	public void save(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setNome(novoCorrentista.getNome());
		correntista.setCpf(novoCorrentista.getCpf());

		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());

		correntista.setConta(conta);
		repository.save(correntista);

	}

	public void delete(Integer id) {
    repository.deleteById(id);
  }
}
