package model;

import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		FiguraFactory figuraFactory = new FiguraFactory() {};
		Figura figura = figuraFactory.createFigura("CIRCULO", Circulo.class.descricaoFigura());
		figura.descricaoFigura();   
	}
}
