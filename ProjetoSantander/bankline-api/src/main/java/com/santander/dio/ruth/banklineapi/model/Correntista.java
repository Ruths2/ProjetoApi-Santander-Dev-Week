package com.santander.dio.ruth.banklineapi.model.Conta;

public class Correntista {
	private Integer id;
	private String cpf;
	private String nome;

	private Conta conta;

	public Conta getConta() {
		return conta;
	}

	public Integer getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

  public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
