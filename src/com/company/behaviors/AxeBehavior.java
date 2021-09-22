package com.company.behaviors;

import com.company.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe");
    }
}
