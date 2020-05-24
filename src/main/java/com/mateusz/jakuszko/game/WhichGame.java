package com.mateusz.jakuszko.game;

import static com.mateusz.jakuszko.game.io.InputOutput.*;

class WhichGame {
    private GameRule gameRule;
    private boolean exit = false;

    void indicateGame() {
        printKindsOfGames();
        int choose = intInput(0, 1);
        do {
            switch (choose) {
                case 0:
                    gameRule = new RpsGameRule();
                    exit = true;
                    break;
                case 1:
                    gameRule = new RpslsGameRule();
                    exit = true;
                    break;
                default:
                    printSomethingWrong();
                    break;
            }
        } while (!exit);
    }

    public GameRule getGameRule() {
        return gameRule;
    }
}
