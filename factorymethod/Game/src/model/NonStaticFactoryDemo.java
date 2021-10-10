package model;


public class NonStaticFactoryDemo {
	public static void main(String args[]){
        
        GameFactory factory = new GameFactory();
        Game game = factory.getGame("CHESS");
        game.createGame();
    
    }
}
