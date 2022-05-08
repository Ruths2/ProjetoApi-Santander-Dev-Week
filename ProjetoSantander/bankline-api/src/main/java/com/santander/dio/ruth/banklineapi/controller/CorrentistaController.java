package com.santander.dio.ruth.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.santander.dio.ruth.banklineapi.model.Correntista;
import com.santander.dio.ruth.banklineapi.repository.CorrentistaRepository;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

	@Autowired
	private CorrentistaRepository repository;

	@GetMapping
	public List<Correntista> findAll() {
		return repository.findAll();
	}

}
