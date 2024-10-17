package com.leilao.anf.form;

import com.leilao.anf.model.Leilao;



public class LeilaoForm {

	private Integer numeroLeilao;
	
	private Integer  loteProdutos;
	
	private String instFin;

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

    public String getInstFin() {
        return instFin;
    }

    public void setInstFin(String instFin) {
        this.instFin = instFin;
    }

	 public Leilao converter(){
        return new Leilao(this.numeroLeilao, this.loteProdutos, this.instFin);
     }
}
