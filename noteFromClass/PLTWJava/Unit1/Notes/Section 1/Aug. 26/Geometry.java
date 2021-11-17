import java.util.Scanner;

public class Geometry {

    /*
        Asks for the values of l, w, and r
        Outputs the claculations of the 
        area of a square and circle
    */
    public static void main(String[] args){
        final double PI = 3.1415926;

        Scanner ui = new Scanner(System.in);

        System.out.println("What is the length of the square?");
        int l = ui.nextint();
        System.out.println("What is the width of the square?");
        int w = ui.nextint();
        System.out.println("What is the radius?");
        int r = ui.nextint();
        System.out.println("The area of the square is "+l*w+", and the radius is "+PI*r^2);
        


    }
}