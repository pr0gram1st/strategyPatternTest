package com.company;

import com.company.characters.King;
import com.company.characters.Knight;
import com.company.characters.Queen;
import com.company.characters.Troll;

public class Main {

    public static void main(String[] args) {
        Character king = new King();
        Character troll = new Troll();
        Character queen = new Queen();
        Character knight = new Knight();
        king.fight();
        troll.fight();
        queen.fight();
        knight.fight();
    }
}
