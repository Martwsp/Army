package soldiers.defensive;

import soldiers.Soldier;

public class Halberdier extends Soldier {

    public Halberdier(int lvl) {
        super.name = "Halbedier";
        super.type = Type.DEFENSIVE;
        super.health = 6 + (3 * lvl);
        super.offense = 4 + (2 * lvl);
        super.defense = 10 + (5 * lvl);
        super.movespeed = 1;
        super.special = "Warcry";
    }

    public void special() {
        System.out.println(super.name + " has frightened the enemy with a warcry!");
    }
}
