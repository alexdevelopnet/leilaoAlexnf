package com.leilao.anf.model;

public enum TipoImovel {
	APARTAMENTOS("Apartamento"), TERRENOS("Terreno"), 
	CASAS("Casa"), EDIFICIOS_COMERCIAIS("Edificio Comercial");
	
	private final String valor;
	TipoImovel(String valorOpcao){
		valor = valorOpcao;
	}
	
	public String getValor() {
		return valor;
	}
}
