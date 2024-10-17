package com.leilao.anf.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.leilao.anf.model.Leilao;

public class LeilaoDto {

	private Integer numeroLeilao;
	private Integer loteProdutos;
	private String instFin;
	private Date data;
	private String endereco;

 
	
	
	public LeilaoDto(Leilao leilao) {
		this.numeroLeilao = leilao.getNumeroLeilao();
        this.loteProdutos = leilao.getLoteProdutos();

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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
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
	
   

    public static List<LeilaoDto> converter(List<Leilao> leiloes) {
       return leiloes.stream().map(LeilaoDto::new).collect(Collectors.toList());
    }

}
