package model;

class Checkers implements Game {

	public Checkers(){
        createGame();
    }
    public void createGame(){
    	System.out.println("---------------------------------------");
        System.out.println("Create Checkers game");
        System.out.println("Opponents:2 or 3 or 4 or 6");
        System.out.println("For each opponent, place 10 coins");
        System.out.println("Start Checkers game");
        System.out.println("---------------------------------------");	
    }
}
