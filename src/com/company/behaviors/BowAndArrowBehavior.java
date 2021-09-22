package com.company.behaviors;

import com.company.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("BowAndArrow");
    }
}
