package com.company.characters;

import com.company.Character;
import com.company.behaviors.AxeBehavior;
import com.company.behaviors.BowAndArrowBehavior;

public class Troll extends Character {
    public Troll() {
        weapon = new AxeBehavior();
    }
}
