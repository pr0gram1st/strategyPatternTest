package com.company.characters;

import com.company.Character;
import com.company.behaviors.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior();
    }

}
