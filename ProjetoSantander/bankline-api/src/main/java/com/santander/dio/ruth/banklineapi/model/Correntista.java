package com.santander.dio.ruth.banklineapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tab_correntista")
public class Correntista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 12)
	private String cpf;
	
	@Column(length = 40)
	private String nome;

	@Embedded
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
