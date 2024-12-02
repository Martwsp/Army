package Soldiers.defensive;

import Soldiers.Soldier;

public class Pikeman extends Soldier implements Defensive {

    public Pikeman(int lvl) {
        super.name = "Pikeman";
        super.type = Type.DEFENSIVE;
        super.health = 8 + (3*lvl);
        super.offense = 6 + (lvl);
        super.defense = 4 + (2*lvl);
        super.movespeed = 1;
        super.special = "Pikewall";
    }

    public void special(){
        System.out.println(super.name + " has formed a pikewall");
    }

}
