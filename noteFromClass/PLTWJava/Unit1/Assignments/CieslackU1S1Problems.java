import java.util.Scanner;
import java.lang.Math;
class CieslackU1S1Problems {
  public static void main(String[] args) {
    convertMileToKM();
    calculateEnergy();
    futureInvestment();
    drivingCost();
  }

  public static void convertMileToKM(){
    Scanner ui = new Scanner(System.in);

    System.out.println("How many miles?");
    double miles = ui.nextDouble(); //only gets strings?!?! need to figure this out

    double kilos = 1.6 * miles;

    System.out.println(miles+" miles is equal to "+String.format("%.2f", kilos)+" kilometers.");
  }

  public static void calculateEnergy(){
    Scanner ui = new Scanner(System.in);

    System.out.println("How many kilos of water?");
    double m = ui.nextDouble();

    System.out.println("What is the initial temperature of the water?");
    double i = ui.nextDouble();

    System.out.println("What is the final temperature of the water?");
    double f = ui.nextDouble();

    double q = m * (f - i) *4184;

    System.out.println("The energy needed is "+String.format("%.2f", q));
  } 

  public static void futureInvestment(){
    Scanner ui = new Scanner(System.in);

    System.out.println("Enter investment amount");
    double iAmount = ui.nextDouble();

    System.out.println("Enter annual interest rate in percentage");
    double iRate = ui.nextDouble();
    iRate /=12;
    iRate /=100;

    System.out.println("Enter number of years");
    double years = ui.nextDouble();
    double months = years*12;

    double fValue = Math.pow(1+iRate, months)*iAmount;

    System.out.println("Future value is $"+String.format("%.2f", fValue));
  }

  public static void drivingCost(){
    Scanner ui = new Scanner(System.in);

    System.out.println("Enter the driving distance");
    double dist = ui.nextDouble();

    System.out.println("Enter miles per gallon");
    double mpg = ui.nextDouble();

    System.out.println("Enter price per gallon");
    double ppg = ui.nextDouble();

    double cost = (dist/mpg)*ppg;
    System.out.println("The cost of driving is $"+String.format("%.2f", cost));
    ui.close();
  }
}