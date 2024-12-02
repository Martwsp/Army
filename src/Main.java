import soldiers.adaptable.Ranger;
import soldiers.adaptable.Spearman;
import soldiers.defensive.Halberdier;
import soldiers.defensive.Pikeman;
import soldiers.offensive.HeavyCavalry;
import soldiers.offensive.LightCavalry;
import soldiers.offensive.ManAtArms;

public class Main {

    public static void main(String[] args) {
        Army army = new Army();
        ManAtArms manAtArms = new ManAtArms(2);
        army.addSoldier(manAtArms);
        HeavyCavalry heavyCavalry = new HeavyCavalry(4);
        army.addSoldier(heavyCavalry);
        LightCavalry lightCavalry = new LightCavalry(1);
        army.addSoldier(lightCavalry);
        Pikeman pikeman = new Pikeman(4);
        army.addSoldier(pikeman);
        Pikeman pikeman2 = new Pikeman(4);
        army.addSoldier(pikeman2);
        Halberdier halberdier = new Halberdier(2);
        army.addSoldier(halberdier);
        Spearman spearman = new Spearman(1);
        army.addSoldier(spearman);
        Ranger ranger = new Ranger(2);
        army.addSoldier(ranger);




        System.out.println("Your army has assembled");
        System.out.println("They are awaiting your command");
        army.help();
        System.out.println("Why not start with a report?");
        army.army();
    }
}