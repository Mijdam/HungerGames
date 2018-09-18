package com.capgemini;

public class Main {

    public static void main(String[] args) {
        GameController game = new GameController();
        game.createPlayers();

        game.playDay();
    }
}
