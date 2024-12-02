package soldiers.offensive;

import soldiers.Soldier;

public class LightCavalry extends Soldier {
    public LightCavalry(int lvl) {
        super.name = "Light cavalry";
        super.type = Type.OFFENSIVE;
        super.health = 6 + (4*lvl);
        super.offense = 8 + (5*lvl);
        super.defense = 2 + (2*lvl);
        super.movespeed = 6;
        super.special = "Flank";
    }

    public void special(){
        System.out.println(super.name + " is flanking the enemy!");
    }
}
