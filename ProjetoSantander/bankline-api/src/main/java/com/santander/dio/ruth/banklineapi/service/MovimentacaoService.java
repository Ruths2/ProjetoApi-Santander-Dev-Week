package com.santander.dio.ruth.banklineapi.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.dio.ruth.banklineapi.dto.NovaMovimentacao;
import com.santander.dio.ruth.banklineapi.model.Movimentacao;
import com.santander.dio.ruth.banklineapi.model.MovimentacaoTipo;
import com.santander.dio.ruth.banklineapi.repository.MovimentacaoRepository;


@Service
public class MovimentacaoService {

	@Autowired
	private MovimentacaoRepository repository;
	public void save(NovaMovimentacao novaMovimentacao) {

		Movimentacao movimentacao = new Movimentacao();

		//Double valor = novaMovimentacao.getTipo()==MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;
		Double valor = novaMovimentacao.getValor();
		if(novaMovimentacao.getTipo() == MovimentacaoTipo.DESPESA)
			valor = valor * -1;

		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(valor);

		repository.save(movimentacao);
	}
}
