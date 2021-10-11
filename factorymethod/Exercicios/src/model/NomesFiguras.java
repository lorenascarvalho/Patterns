package model;

import java.util.HashMap;

public class NomesFiguras {
	public static void main (String args[]){
		HashMap<String,Figura> nomes = new HashMap<String,Figura>();
		
		nomes.put("CIRCULO", new Circulo());
		nomes.put("TRIANGULO", new TrEquilatero());
		nomes.put("QUADRADO", new Quadrado());
	}
	

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
