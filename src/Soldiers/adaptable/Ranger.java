package Soldiers.adaptable;

import Soldiers.Soldier;

public class Ranger extends Soldier implements Adaptable {

    public Ranger(int lvl) {
        super.name = "Ranger";
        super.type = Type.ADAPTABLE;
        super.health = 5 + (5 * lvl);
        super.offense = 4 + (3 * lvl);
        super.defense = 4 + (2 * lvl);
        super.movespeed = 4;
        super.special = "Barrage";
    }

    public void special() {
        System.out.println(super.name + " is barraging the enemy with arrows!");
    }
}