package com.mateusz.jakuszko.game;

public interface GameRule {

    void whoWin(int firstChoose, int secondChoose);

    void setPlayers(Player player1, Player player2);
}
