package model;

import java.util.HashMap;

public class GameFactory implements IGameFactory {

	HashMap<String,Game> games = new HashMap<String,Game>();

    public GameFactory(){
        
        games.put(Chess.class.getName(),new Chess());
        games.put(Checkers.class.getName(),new Checkers());
        games.put(Ludo.class.getName(),new Ludo());        
    }
    public Game getGame(String gameName){
        return games.get(gameName);
    }

    
    public Game CriarGame(String tiposGames) {
		if (tiposGames == null || tiposGames.isEmpty())
			return null;
		if ("CHESS".equals(tiposGames)) {
			return new Chess();
		} else if ("CHECKERS".equals(tiposGames)) {
			return new Checkers();
		} else if ("LUDO".equals(tiposGames)) {
			return new Ludo();
		}
		return null;

	}
}
