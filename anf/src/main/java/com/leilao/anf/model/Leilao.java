package com.leilao.anf.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Leilao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 @Column(nullable = true)
    private Integer numeroLeilao;
	@Column(nullable = true)
	private Integer loteProdutos;
	
	private String instFin;
	 
	public Leilao(Integer numeroLeilao, Integer loteProdutos, String instFin) {
		this.numeroLeilao = numeroLeilao;
		this.loteProdutos = loteProdutos;
		this.instFin = instFin;
	}




	private LocalDateTime data  = LocalDateTime.now();
	private String endereco;

    // private Object tipo;

    public Leilao() {} 
	
	// public Leilao(Integer numeroLeilao,Integer loteProdutos, String instFin) {
	// 	this.numeroLeilao = numeroLeilao;
	// 	this.loteProdutos = loteProdutos;
	// 	this.instFin = instFin;
		
	// }

	public Integer getNumeroLeilao() {
		return numeroLeilao;
	}
	public void setNumeroLeilao(Integer numeroLeilao) {
		this.numeroLeilao = numeroLeilao;
	}
	public Integer getLoteProdutos() {
		return loteProdutos;
	}
	public void setLoteProdutos(Integer loteProdutos) {
		this.loteProdutos = loteProdutos;
	}
	public LocalDateTime getDataCriacao() {
		return data;
	}
    public void setDataCriacao(LocalDateTime dataCriacao) {
		this.data = dataCriacao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getInstFin() {
		return instFin;
	}
	public void setInstFin(String instFin) {
		this.instFin = instFin;
	}
	
	 
	 

    public Long getId() {
        return id;
    }
}
