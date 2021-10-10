package model;

public class App {
	public static void main(String[] args) {
		FiguraFactory figuraFactory = new FiguraFactory() {};
		Figura figura = figuraFactory.createFigura("CIRCULO");
		figura.descricaoFigura();

	}
}
