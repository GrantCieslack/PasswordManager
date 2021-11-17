import java.util.Scanner;
import java.lang.Math;

class CieslackU1S2 {
  public static void main(String[] args) {
    // triangleArea();
    midPointTable();
    // minuteYearConverter();
    // triangleVolume();
  }

  private static void triangleArea(){
    Scanner ui = new Scanner(System.in);

    System.out.println("Enter x1");
    double x1 = ui.nextDouble();

    System.out.println("Enter y1");
    double y1 = ui.nextDouble();

    System.out.println("Enter x2");
    double x2 = ui.nextDouble();

    System.out.println("Enter y2");
    double y2 = ui.nextDouble();

    System.out.println("Enter x3");
    double x3 = ui.nextDouble();

    System.out.println("Enter y3");
    double y3 = ui.nextDouble();

    double side1 = Math.pow((Math.pow(x1-x2,2))+(Math.pow(y1-y2,2)),.5);
    double side2 = Math.pow((Math.pow(x2-x3,2))+(Math.pow(y2-y3,2)),.5);
    double side3 = Math.pow((Math.pow(x3-x1,2))+(Math.pow(y3-y1,2)),.5);
    double s = (side1 + side2 + side3)/2;
    double area = Math.pow((s)*(s-side1)*(s-side2)*(s-side3),.5);

    System.out.println("Area of Triangle: " +area);

    ui.close();
  }

  private static void midPointTable(){
    System.out.printf(" a\t b\t Middle Point\n");
    System.out.printf("(0,0)\t(2,1)\t%s\n",midpoint(0,0,2,1));
    System.out.printf("(1,4)\t(4,2)\t%s\n",midpoint(1,4,4,2));
    System.out.printf("(2,7)\t(6,3)\t%s\n",midpoint(2,7,6,3));
    System.out.printf("(3,9)\t(10,5)\t%s\n",midpoint(3,9,10,5));
    System.out.printf("(4,11)\t(12,7)\t%s\n",midpoint(4,11,12,7));

//this is apparenlty wrong math

  }

  private static String midpoint(double x1, double y1, double x2, double y2){
    double deltaX = ((x1+x2)/2);
    double deltaY = ((y1+y2)/2);
    
    String output="("+deltaX+","+deltaY+")";

    return output;
  }

  private static void minuteYearConverter(){
    Scanner ui = new Scanner(System.in);

    System.out.println("Enter number of minutes: ");
    double min = ui.nextDouble();

    double years = min/525600;
    double days = (min%525600)/1440;

   System.out.println(min+" minutes is equal to "+String.format("%.0f", years)+" years and "+String.format("%.0f", days)+" days");
  }

  private static void triangleVolume(){
    Scanner ui = new Scanner(System.in);

    System.out.println("Enter length of length and height: ");
    double length = 3.5;//ui.nextDouble();

    double area = ((Math.sqrt(3.)/4.)*Math.pow(length, 2));
    double volume = area*length;
  
    System.out.println("The area is: "+String.format("%.2f", area));  
    System.out.println("The Volume is: "+String.format("%.2f", volume));

  ui.close();
  }
}