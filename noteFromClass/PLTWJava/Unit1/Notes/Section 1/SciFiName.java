import java.util.Scanner;
import java.lang.Math;
public class SciFiName {
    
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        
        //ask user first name
        System.out.print("Please enter your first name: ");
        String first = ui.nextLine();

        //ask user last name
        System.out.print("Please enter your last name: ");
        String last = ui.nextLine();

        //ask user city name
        System.out.print("Please enter your city's name: ");
        String city = ui.nextLine();

        //ask user school name
        System.out.print("Please enter your school's name: ");
        String school = ui.nextLine();

        //ask user brother's name
        System.out.print("Please enter your brother's name: ");
        String brother = ui.nextLine();

        // ask user sister's name
        System.out.print("Please enter your sister's name: ");
        String sister = ui.nextLine();

        //generate random numbers
        //Math.random() -> # between 0 and .99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999
        //random number between 0 and a value
        int rF = (int) (Math.random()*first.length());
        int rL = (int) (Math.random()*last.length());
        int rC = (int) (Math.random()*city.length());
        int rS = (int) (Math.random()*school.length());
        int rB = (int) (Math.random()*brother.length());
        int rSi = (int) (Math.random()*sister.length());

        //generate scifi first name
        String sciFiFirst = first.substring(0,rF) + last.substring(rL);

        //generate scifi last name
        String sciFiLast = city.substring(0,rC) + school.substring(rS);

        //generate scifi home name
        String sciFiHome = brother.substring(rB) + sister.substring(0,rSi);

        //print out a welcome statement
        System.out.print("Welcome "+sciFiFirst+" "+sciFiLast+" from "+sciFiHome);

    }
}
