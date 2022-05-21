package com.santander.dio.ruth.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.santander.dio.ruth.banklineapi.model.Correntista;
import com.santander.dio.ruth.banklineapi.repository.CorrentistaRepository;
import com.santander.dio.ruth.banklineapi.dto.NovoCorrentista;
import com.santander.dio.ruth.banklineapi.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

	@Autowired
	private CorrentistaRepository repository;

	@Autowired
	private CorrentistaService service;

	@GetMapping
	public List<Correntista> findAll() {
		return repository.findAll();
	}

  @PostMapping
	public void save(@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
