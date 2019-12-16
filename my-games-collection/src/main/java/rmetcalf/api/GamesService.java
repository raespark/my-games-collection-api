package rmetcalf.api;

import rmetcalf.api.model.Game;
import rmetcalf.api.GamesApi;

import rmetcalf.db.GamesDb;

public class GamesService implements GamesApi{

    GamesDb db;

    public GamesService(GamesDb gamesDb) {
        this.db = gamesDb;
    }

    public ArrayList<Game> getAllGames() {
        return db.getAllGames();
    }
}