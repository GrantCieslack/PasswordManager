import java.util.Scanner;

public class CieslackBellringer0830 {

    public static void main (String[] args){

        Scanner ui = new Scanner(System.in);
        //intro greeting
        System.out.println("Hello Human");
        System.out.println("What is your name?");
        //get name
        String name = ui.nextLine();
        //ask school
        System.out.println(name+", where do you go to school?");
        String school = ui.nextLine();
        //get school
        System.out.println("Do you like going there?");
        String status = ui.next();
        System.out.println("Well "+name+" I hope you enjoy your day at "+school);
        //name n school output


        ui.close();

    }
}