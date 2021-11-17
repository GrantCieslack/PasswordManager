import java.util.Scanner;
import java.util.*;
import java.lang.Math;

public class CieslackTextAdv {
    public static void main(String[] args){
        start();       
        // victory();
    }
    private static void start(){
        Scanner ui = new Scanner(System.in);
            //intro
            int yearsRand = (int) (Math.random()*100);
            System.out.println("You're eyes open as the sound of an explosion rings in your ears.");
            System.out.printf("Your ship is being attacked for the first time in %s years!\n",yearsRand);
            System.out.println("Do you...patch holes in the ship(p), fire back at the attacker(f), or dance(d)");
            String in = ui.nextLine();
        //choice
        if(in.equals("p")){
            patch();
        }
        else if(in.equals("f")){
            fireBack();
        }
        else if(in.equals("d")){
            dance();
        }
        else{
            start();
        }

        ui.close();
    }
    private static void patch(){
        Scanner ui = new Scanner(System.in);

        System.out.print("You jump to your feet and spring into action, swiping the materials and tools needed to patch the ship.\n"+
        "As you patch the last visible hole, you are attacked by the enemy ship's captain who boarded your ship\n"+
        "Do you...fight back(f) or beg for mercy(b)");

        String in = ui.nextLine();

        if(in.equals("f")){
            fight();
        }
        else if(in.equals("b")){
            System.out.println("'Yarrrg, it seems we've got a coward on this 'er ship'\n"+"The captain slashes you with his sword");
            defeat();
        }

        ui.close();
    }

    private static void fight(){
        Scanner ui = new Scanner(System.in);
        
        System.out.println("You draw your cutlass and point it toward him. He swings his sword at you!\n"+
        "Do you...block it with your sword(b) or call for help(c)");
        
        String in = ui.nextLine();
        if(in.equals("b")){
            System.out.println("You raise your sword and block the attack,");
        }
        else if(in.equals("c")){
            fireBack();
        }
        else{
            fight();
        }


        ui.close();
    }


    
    private static void fireBack(){
        Scanner ui = new Scanner(System.in);

        int hits = 0;
        System.out.println("You jump to your feet and staight to the cannons, drowsy, but ready none the less");
        System.out.println("How do you wish to fire...accurate(a) or rapid(r)");

        String in = ui.nextLine();

        //cannon fire loops
        if(in.equals("a")){
            //accurate -> 3 shots 80% accuracy
            double hitChance = .8;
            int i = 3;
                while(i>0){
                    double shot = Math.random()*1;
                    System.out.println(shot);
                    if(shot<hitChance){
                      System.out.println("hit");
                        hits++;
                    }
                    i--;
                }
        }
        else if(in.equals("r")){
            //rapid -> 7 shots 30% accuracy
            double hitChance = .3;
            int i = 5;
                while(i>0){
                    double shot = Math.random()*1;
                    if(shot<hitChance){
                        hits++;
                    }
                    i--;
                }
        }
        else{
            fireBack();
        }
        
        //battle outcome
        if(hits>=2){
          System.out.println("You fire off several shots, enough to sink the opposing ship and save the day!");
            victory();
        }
        else if (hits<2){
          System.out.println("You fire off several shots, but you're not accurate enough! You're forced to walk the plank");
            defeat();
        }
        
        ui.close();

    }
    
    private static void dance(){

        System.out.println("You begin to dance in a way that feels almost natural, others see you and begin to dance aswell\n"+
        "You and 3 others begin dancing in unison");
        for (int i = 0; i < 5; i++) {
            System.out.println("'Come oh Dark One! Save us from our enemies' blades'");
        }
        System.out.println("Giant tentacles burst from the water, wrapping around the enemy ship and pulling it under");

        victory();
    }


    private static void victory(){
        Scanner ui = new Scanner(System.in);

        System.out.println("You were victorious!\n"+"Enter your name, young champion\n");
        String name = ui.nextLine();
        if(name.equals("Jack Sparrow") || name.equals("Davy Jones")){
          System.out.printf("%s!? THAT'S NOT YOU REAL NAME",name);
          victory();
        }else{
        System.out.printf("You will forever be known as %s the Great", name);
        }
        ui.close();
    }

    private static void defeat(){
        Scanner ui = new Scanner(System.in);
        
        System.out.println("You Lost!\n"+"Enter your name, loser\n");
        String name = ui.nextLine();
        if(name.equals("Jack Sparrow") || name.equals("Davy Jones")){
          System.out.printf("%s!?THAT'S NOT YOU REAL NAME",name);
          victory();
        }else{
        System.out.printf("You will forever be known as %s the Loser", name);
        }

        ui.close();
    }

}
