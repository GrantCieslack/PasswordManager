import java.util.Scanner;

public class NameScanner {

    public static void main (String[] args){

        Scanner ui = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = ui.nextLine();

        System.out.println("Hello! "+name);

        System.out.println("How are you doing today?");
        String status = ui.next();
        System.out.println("That's nice you are "+status);



        ui.close();

    }
}