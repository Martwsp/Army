package Soldiers;

public abstract class Soldier {
    protected String name;
    protected String type;
    protected int health;
    protected int offense;
    protected int defense;
    protected int movespeed;
    protected String special;

    public void report(){
        System.out.println(this.type + " - " + this.name + ":  " + this.health + "hp " + this.offense + "A," + this.defense + "D," + this.movespeed + "M."
        + "  Special move: " + special);
    }

    public void move(){
        System.out.println(this.name + " is moving by " + this.movespeed + " squares.");
    }

    public  void attack(){
        System.out.println(name + " attacks for " + this.offense + " damage.");
    }

    public void defend() {
        System.out.println(name + " is defending for " + this.defense + " damage.");
    }

    public void special() {};

    public String getSpecial(){
        return this.special;
    }

}
