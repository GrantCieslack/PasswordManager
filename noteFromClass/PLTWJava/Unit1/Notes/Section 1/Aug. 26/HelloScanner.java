import java.util.Scanner;

//some user input
public class HelloScanner {

    public static void main(String[] args){
        //python -> input("the message") -> input a string
        //ClassName objectname = new ClassConstructor(parameter for obj);
        Scanner ui = new Scanner(System.in);
        System.out.println("What is your name? ");

        //English = Create String name that gets the nextLine from the terminal
        String name = ui.nextLine();

        System.out.println("Hello! "+name);

        ui.close();

    }



}