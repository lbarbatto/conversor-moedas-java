package conversororacle.view;

import conversororacle.model.CambioReal;

public class EditaResposta {
	MenuMoedas moedaSimbolo = new MenuMoedas();
	
	public String converteRespostaConversor(String resposta, int index) {
				
		String [] stringArray = resposta.split(",");
		String[] resultado = stringArray[12].split(":");
		double valor =  Double.parseDouble(resultado[1].replaceAll("}", ""));
		String respostaFinal;

//		for(int j=0; j < resultado.length; j++){
//			System.out.println(j+resultado[j]);
//		}
//		System.out.println(valor);

		String simbolo = moedaSimbolo.getSimboloMoeda(index);
		
		switch (index) {
		case 0:			
			respostaFinal = simbolo+" "+formatDouble(valor);
			return respostaFinal;

		case 1:
			respostaFinal = simbolo+" "+formatDouble(valor);
			return respostaFinal;
			
		case 2:
			respostaFinal = simbolo+" "+formatDouble(valor);
			return respostaFinal;
			
		case 3:
			respostaFinal = simbolo+" "+formatDouble(valor);
			return respostaFinal;
			
		case 4:
			respostaFinal = simbolo+" "+formatDouble(valor);
			return respostaFinal;
			
		case 5:
			respostaFinal = formatDouble(valor)+" "+simbolo;
			return respostaFinal;
		}
		return null;		
	}
	
	public static String formatDouble(double x) {
	    return String.format("%.2f", x);
	}
	
	public static double paraDouble(String entrada) {
		
		entrada = entrada.replaceAll(",",  ".");
		double amount = Double.parseDouble(entrada);
		return amount;
		
	}
	
	public Object converteRespostaCambio(String resposta) {
		String [] stringArray = resposta.split(",");
		CambioReal cambio = new CambioReal();
		String[] resultado = stringArray[17].split(":");
		String stringValor = formatDouble(Double.parseDouble(resultado[1]));
//		stringValor = stringValor.replaceAll(".", ",");
		
		cambio.setArs(moedaSimbolo.getSimboloMoeda(0) + " " + stringValor);
		
		resultado = stringArray[38].split(":");
		stringValor = formatDouble(Double.parseDouble(resultado[1]));
		cambio.setClp(moedaSimbolo.getSimboloMoeda(2) + " " + stringValor);
		
		resultado = stringArray[52].split(":");
		stringValor = formatDouble(Double.parseDouble(resultado[1]));
		cambio.setEur(stringValor + " " + moedaSimbolo.getSimboloMoeda(5));
		
		resultado = stringArray[56].split(":");
		stringValor = formatDouble(Double.parseDouble(resultado[1]));
		cambio.setGbp(moedaSimbolo.getSimboloMoeda(4) + " " + stringValor);
		
		resultado = stringArray[156].split(":");
		stringValor = formatDouble(Double.parseDouble(resultado[1]));
		cambio.setUsd(moedaSimbolo.getSimboloMoeda(3) + " " + stringValor);
		resultado = stringArray[5].split(" ");
		cambio.setData(resultado[1]+"/"+resultado[2]+"/"+resultado[3]);
		
		return cambio;
//		String[] resultado = stringArray[12].split(":");
//		double valor = Double.parseDouble(resultado[1].replaceAll("}", ""));
//		String respostaFinal;
//		for(int j=0; j < stringArray.length; j++){
//			System.out.println(j+stringArray[j]);
//		}
	}
}
