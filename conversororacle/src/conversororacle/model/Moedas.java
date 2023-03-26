package conversororacle.model;

public enum Moedas {

	A("ARS", "$", "Argentina - Peso"), 
	B("BRL", "R$", "Brasil - Real"), 
	C("CLP", "$", "Chile - Peso"),
	D("USD", "US$", "Estados Unidos - Dólar"), 
	E("GBP", "£", "Reino Unido - Libra Esterlina"),
	F("EUR", "€", "União Europeia - Euro");

	private String indice;
	private String descricao;
	private String simbolo;

	Moedas(String indice, String simbolo, String descricao) {
		this.indice = indice;
		this.simbolo = simbolo;
		this.descricao = descricao;
	}

	public String getIndice() {
		return this.indice;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getSimbolo() {
		return simbolo;
	}

}
