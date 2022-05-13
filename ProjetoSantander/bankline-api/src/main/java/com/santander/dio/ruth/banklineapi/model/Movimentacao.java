package com.santander.dio.ruth.banklineapi.model;

import java.time.LocalDateTime;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	private String descricao;
	private Double valor;

	@Enumerated(EnumType.STRING)
	private MovimentacaoTipo tipo;

	@Column(name = "id_conta")
	private Integer idConta;

	public Integer getId() {
		return id;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public MovimentacaoTipo getTipo() {
		return tipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

}
