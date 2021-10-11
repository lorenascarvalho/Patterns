package model;

import java.util.HashMap;

public class FiguraFactory {

	public static Figura createFigura(NomesFiguras nomesFigura) { 
	    
	    if (nomesFigura == null || nomesFigura.isEmpty())
			return null;
		if (nomesFigura.equals("TRIANGULO")) {
			return new TrEquilatero();
		} else if (nomesFigura.equals("CIRCULO")) {
			return new Circulo();
		} else if (nomesFigura.equals("QUADRADO")) {
			return new Quadrado();
		}
		return null;

	}
	
}
