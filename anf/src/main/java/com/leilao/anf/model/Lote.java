package com.leilao.anf.model;

import java.util.List;

public class Lote {
	 
	private Integer numLote;
	private List <Integer> qtdeProd;
	 
	private Leilao leilao;
	private Imovel imovel;
	private Veiculo veiculo;
	
	public Lote(Integer numLote, List<Integer> qtdeProd, Imovel imovel, Veiculo veiculo) {
		this.numLote = numLote;
		this.qtdeProd=qtdeProd;
		this.imovel = imovel;
		this.veiculo = veiculo;
	}
	
	
	public Integer getNumLote() {
		return numLote;
	}

	public void setNumLote(Integer numLote) {
		this.numLote = numLote;
	}
 
	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public List<Integer> getQtdeProd() {
		return qtdeProd;
	}


	public void setQtdeProd(List<Integer> qtdeProd) {
		this.qtdeProd = qtdeProd;
	}
	
}
