package com.santander.dio.ruth.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.santander.dio.ruth.banklineapi.model.Movimentacao;
import com.santander.dio.ruth.banklineapi.repository.MovimentacaoRepository;
import com.santander.dio.ruth.banklineapi.dto.NovaMovimentacao;
import com.santander.dio.ruth.banklineapi.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

	@Autowired
	private MovimentacaoRepository repository;

	@Autowired
	private MovimentacaoService service;

	@GetMapping
	public List<Movimentacao> findAll() {
		return repository.findAll();
	}

	@GetMapping("/{idConta}")
	public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta){
		return repository.findByIdConta(idConta);
	}

  @PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
}
