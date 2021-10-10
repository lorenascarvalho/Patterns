package model;

import java.util.HashMap;

public abstract class FiguraFactory {

	public Figura createFigura(String tipoFigura) { 
	    
	    if (tipoFigura == null || tipoFigura.isEmpty())
			return null;
		if ("TRIANGULO".equals(tipoFigura)) {
			return new TrEquilatero();
		} else if ("CIRCULO".equals(tipoFigura)) {
			return new Circulo();
		} else if ("QUADRADO".equals(tipoFigura)) {
			return new Quadrado();
		}
		return null;

	}
	
}
