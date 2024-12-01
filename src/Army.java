import Soldiers.Adaptable;
import Soldiers.Defensive;
import Soldiers.Offensive;
import Soldiers.Soldier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Army {
    List<Soldier> soldiers = new ArrayList<>();

    public void army() {
        Scanner scanner = new Scanner(System.in);
        List<String> specials = new ArrayList<>();
        for (Soldier soldier : soldiers) {
            specials.add(soldier.getSpecial().toUpperCase());
        }
        while (true) {
            try {
                String command = scanner.nextLine();
                if (command.equalsIgnoreCase("EXIT")) {
                    break;
                } else if (specials.contains(command.toUpperCase())) {
                    for (Soldier soldier : soldiers) {
                        if (command.equalsIgnoreCase(soldier.getSpecial())) {
                            soldier.special();
                        }
                    }
                } else {
                    switch (command.toUpperCase()) {
                        case "REPORT" -> report();
                        case "ATTACK" -> attack();
                        case "DEFEND" -> defend();
                        case "MOVE" -> move();
                        case "HELP" -> help();
                        default -> System.out.println("Command not recognized.");
                    }
                }


            } catch (Exception e) {
                System.out.println("Command not recognized.");
            }
        }

    }

    public void help() {
        System.out.println("Input:");
        System.out.println("Report");
        System.out.println("Attack");
        System.out.println("Defend");
        System.out.println("Move");
        System.out.println("or the name of a special move of a soldier");
        System.out.println("or exit to exit");
    }

    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);
    }

    public void report() {
        for (Soldier soldier : this.soldiers) {
            soldier.report();
        }
    }

    public void move() {
        for (Soldier soldier : this.soldiers) {
            soldier.move();
        }
    }

    public void attack() {
        for (Soldier soldier : this.soldiers)
            if (soldier instanceof Offensive || soldier instanceof Adaptable) {
                soldier.attack();
            }
    }

    public void defend() {
        for (Soldier soldier : this.soldiers)
            if (soldier instanceof Defensive || soldier instanceof Adaptable) {
                soldier.defend();
            }
    }
}
