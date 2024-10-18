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
 @Column(nullable = true ,name="numeroLeilao")
    private Integer numeroLeilao;
	@Column(nullable = true ,name="loteProdutos")
	private Integer loteProdutos;
	@Column(nullable = true ,name="instFin")
	private String instFin;
	 
	

	private LocalDateTime data  = LocalDateTime.now();
	private String endereco;

    // private Object tipo;

    public Leilao() {} 
 
	 
	public Leilao(Integer numeroLeilao,Integer loteProdutos, String instFin,  String endereco) {
		this.numeroLeilao = numeroLeilao;
		this.loteProdutos = loteProdutos;
		//this.tipo = tipo;
		this.instFin = instFin;
		//this.data = data;
		this.endereco = endereco;
	}

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
