package com.simplerpg.inventory;

// No decorators for armor yet, but we can easily add them later if we want to add special effects like fire resistance, etc.
public class Armor extends Item {
    int defense;

    public Armor(String name, int defense) {
        super(name);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

}
