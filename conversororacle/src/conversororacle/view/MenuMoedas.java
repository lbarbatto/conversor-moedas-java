package conversororacle.view;

import conversororacle.model.Moedas;

public class MenuMoedas {

	private String[] listaMoedas = (new String[] { 
			Moedas.A.getDescricao(), 
			Moedas.B.getDescricao(),
			Moedas.C.getDescricao(), 
			Moedas.D.getDescricao(), 
			Moedas.E.getDescricao(), 
			Moedas.F.getDescricao() 
			});

	public String[] getListaMoedas() {
		return listaMoedas;

	}

	public String getCodidoMoeda(int index) {
		Moedas indiceMoeda = Moedas.values()[index];
		return indiceMoeda.getIndice();
	}

	public String getSimboloMoeda(int index) {
		Moedas indiceMoeda = Moedas.values()[index];
		return indiceMoeda.getSimbolo();
	}

}
