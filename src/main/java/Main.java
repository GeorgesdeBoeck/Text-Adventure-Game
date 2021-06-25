import hero.Caster;
import hero.Hero;
import hero.Melee;
import hero.Ranged;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare scanner to gather input from the player
        Scanner userInput = new Scanner(System.in);
        String dialogue = "";

        //getting to know the hero
        System.out.println("Enter you name, hero");
        String heroName = userInput.nextLine();

        //setting the class of the hero
        String heroClass ="";
        boolean heroIsDetermined = false;
        //ask the player what kind of hero they are for max. 4 times
        while (!heroIsDetermined) {
            //ask what kind of hero they are
            System.out.println("What kind of hero are you, " + heroName + "? Melee, Ranged or a Caster?");
            heroClass = userInput.nextLine();

            //create a new instance based on the type of hero
            if (heroClass.equalsIgnoreCase("melee") || heroClass.equalsIgnoreCase("ranged") || heroClass.equalsIgnoreCase("caster")) {
                System.out.println("Welcome, Hero!");
                heroIsDetermined = true;
            } else {
                //if they give the wrong input, the loop starts again
                System.out.println("Please enter valid input!");
                }
            }

        Hero myHero;

        if (heroClass.equalsIgnoreCase("melee")) {
            myHero = new Melee();
        } else if (heroClass.equalsIgnoreCase("ranged")) {
            myHero = new Ranged();
        } else {
            myHero = new Caster();
        }

        System.out.println("Your hero is of the type " + heroClass + ". And you have " + myHero.getHealthPoints() + " healthpoints and " + myHero.getManaPoints() + " manapoints.");
        System.out.println(heroName + ": " + myHero.getCatchPhrase());
        System.out.println("You can assign 10 stats to Strength, Agility and Intellect.\nStrength increases your damage and your max health.\nAgility increases the probability that you can crit with attacks.\nIntellect increases your mana and increases your mana generation.");
        System.out.println("Do you want to assign stats? Yes or No?");

        dialogue = userInput.nextLine();

        boolean statsAssigned = false;
        while(!statsAssigned){


            statsAssigned = true;
        }
    }

/*


        dialogue = userInput.nextLine();

        j = 0;
        int i = 0;
        while (i < 1) {
            if (!dialogue.equalsIgnoreCase("yes") && !dialogue.equalsIgnoreCase("y") && dialogue.equalsIgnoreCase("no") && dialogue.equalsIgnoreCase("n")) {
                System.out.println("Please enter valid input");
                j++;
                dialogue = userInput.nextLine();
                if (j == 4) {
                    System.out.println("Stop being a jerk!");
                    System.exit(0);
                }
            } else if (dialogue.equalsIgnoreCase("yes") || dialogue.equalsIgnoreCase("y")) {
                System.out.println("Which stat do you want to assign? Strength, Dexterity or Intellect and how much? Denote like 'stat number'.");
                String stat = userInput.next();
                int number = parseInt(userInput.next());
                myHero.transferStats(stat, number);
                System.out.println("Do you want to assign another stat?");
                dialogue = userInput.nextLine();
            } else if (dialogue.equalsIgnoreCase("no") || dialogue.equalsIgnoreCase("n")) {
                System.out.println("Let's move on to your adventure!");
                i++;
            }
        }

        System.out.println("Let's start your adventure!");

    }

         */
    }
