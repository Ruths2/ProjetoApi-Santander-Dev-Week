package com.santander.dio.ruth.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {

	@Column(name = "conta_numero")
	private Long numero;

	@Column(name = "conta_saldo")
	private Double saldo;

	public Long getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
