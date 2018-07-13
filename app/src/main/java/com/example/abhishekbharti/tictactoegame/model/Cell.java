package com.example.abhishekbharti.tictactoegame.model;

import com.example.abhishekbharti.tictactoegame.utilities.StringUtility;

public class Cell {

    public Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || StringUtility.isNullOrEmpty(player.value);
    }
}
