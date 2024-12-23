package soldiers.adaptable;

import soldiers.Soldier;

public class Spearman extends Soldier {

    public Spearman(int lvl) {
        super.name = "Spearman";
        super.type = Type.ADAPTABLE;
        super.health = 5 + (3*lvl);
        super.offense = 6 + (2*lvl);
        super.defense = 10 + (5*lvl);
        super.movespeed = 3;
        super.special = "Throw spear";
    }

    public void special(){
        System.out.println(super.name + " has chucked his spear at the enemy dealing " + (super.offense*2) + " dmg!");
    }

}
