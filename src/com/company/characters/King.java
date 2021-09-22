package com.company.characters;

import com.company.Character;
import com.company.behaviors.KnifeBehavior;

public class King extends Character {
    public King() {
        weapon = new KnifeBehavior();
    }
}
