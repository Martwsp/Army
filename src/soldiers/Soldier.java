package soldiers;

public abstract class Soldier {
    protected String name;
    protected Type type;
    protected int health;
    protected int offense;
    protected int defense;
    protected int movespeed;
    protected String special;

    public void report(){
        System.out.println(typeString() + " - " + this.name + ":  " + this.health + "hp " + this.offense + "A," + this.defense + "D," + this.movespeed + "M."
        + "  Special move: " + special);
    }

    public void move(){
        System.out.println(this.name + " is moving by " + this.movespeed + " squares.");
    }

    public  void attack(){
        switch(this.type){
            case OFFENSIVE, ADAPTABLE ->System.out.println(name + " attacks for " + this.offense + " damage.");
        }
    }

    public void defend() {
        switch(this.type) {
            case DEFENSIVE, ADAPTABLE-> System.out.println(name + " is defending for " + this.defense + " damage.");
        }
    }

    public abstract void special();

    public String getSpecial(){
        return this.special;
    }

    public String typeString(){
        String typeString;
        switch (this.type){
            case OFFENSIVE -> typeString = "Offensive";
            case DEFENSIVE -> typeString = "Defensive";
            case ADAPTABLE -> typeString = "Versatile";
            default -> typeString = "";
        }
        return typeString;
    }

    public enum Type {
        OFFENSIVE, DEFENSIVE, ADAPTABLE
    }

}
