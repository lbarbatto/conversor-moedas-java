package conversororacle.controller;

import javax.swing.JOptionPane;

public class ValidaEntrada {
	
	public double getAmount(String entrada) {
		
		entrada = entrada.replaceAll(",",  ".");
		double amount = Double.parseDouble(entrada);
		return amount;
		
	}
	
	public Boolean entradaValida(String entrada) {
		
		entrada = entrada.replaceAll(",",  ".");		
	    if(entrada.equals("")){  
	        JOptionPane.showMessageDialog(null, "Campo Valor não pode ser vazio","Erro de preenchimento", 0, null);
	        return false; 
	    }
	    try {
	        Double.parseDouble(entrada);
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Campo Valor não é um número","Erro de preenchimento", 0, null);
	        return false;
	    }
	    return true; 

	}

}
