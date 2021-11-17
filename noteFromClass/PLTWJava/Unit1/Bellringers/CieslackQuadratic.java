import java.lang.Math;
import java.util.Scanner;

public class CieslackQuadratic {

    public static void main(String[]args){
    Scanner ui = new Scanner(System.in);

    System.out.println("Enter the a value:");
    double a = ui.nextDouble(); 

    System.out.println("Enter the b value:");
    double b = ui.nextDouble(); 

    System.out.println("Enter the c value:");
    double c = ui.nextDouble(); 

    double Rpos =(-b + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a;
    double Rneg =(-b - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a;
    double dis = Math.pow(b, 2)-(4*a*c);

    if(dis>0){
        System.out.println("The equations has two roots " +String.format("%.5f", Rpos) +" and "+String.format("%.5f", Rneg));
        // System.out.printf("The equations has two roots %f and %f",String.format("%.5f", Rpos),String.format("%.5f", Rneg));
    }
    else if(dis == 0){
        System.out.println("The equations has one root " +String.format("%.5f", Rpos));
        // System.out.printf("The equations has one root %f",String.format("%.5f", Rpos));
    }
    else{
        System.out.println("The equation has no real roots");
    }


    }

}

