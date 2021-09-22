package com.company.characters;

import com.company.Character;
import com.company.behaviors.BowAndArrowBehavior;
import com.company.behaviors.SwordBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }
}
