package soldiers.offensive;

import soldiers.Soldier;

public class ManAtArms extends Soldier {

    public ManAtArms(int lvl) {
        super.name = "Man at arms";
        super.type = Type.OFFENSIVE;
        super.health = 10 + (5*lvl);
        super.offense = 8 + (3*lvl);
        super.defense = 5 + (2*lvl);
        super.movespeed = 2;
        super.special = "Warcry";
    }

    public void special(){
        System.out.println(super.name + " has frightened the enemy with a warcry!");
    }

}
