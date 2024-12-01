package Soldiers;

public class HeavyCavalry extends Soldier implements Offensive {
    public HeavyCavalry(int lvl) {
        super.name = "Heavy cavalry";
        super.type = "Offensive";
        super.health = 8 + (4*lvl);
        super.offense = 10 + (4*lvl);
        super.defense = 4 + (2*lvl);
        super.movespeed = 4;
        super.special = "Charge";
    }

    public void special(){
        System.out.println(super.name + " is charging at the enemy!");
    }
}
