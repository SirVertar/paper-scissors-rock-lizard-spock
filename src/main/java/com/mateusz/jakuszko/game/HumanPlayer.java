package com.mateusz.jakuszko.game;

import static com.mateusz.jakuszko.game.io.InputOutput.*;


public class HumanPlayer extends Player {

    HumanPlayer(String name, GameRule gameRule) {
        super(name, gameRule);
    }

    @Override
    public int makeMove() {
        if (getGameRule() instanceof RpslsGameRule) {
            playerChoose = intInput(0, 6);
            return playerChoose;
        } else if (getGameRule() instanceof RpsGameRule) {
            playerChoose = intInput(0, 4);
            return playerChoose;
        } else {
            printSomethingWrong();
            return 99;
        }
    }
}
