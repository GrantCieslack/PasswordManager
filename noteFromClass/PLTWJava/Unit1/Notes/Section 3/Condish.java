import java.util.Scanner;

public class Condish {
    public static void main(String[] args) {
        //CONDITIONAL STATEMENT -> if then else  else if

        // int a = 3;
        // int b = 8;
        // int c = 6;

        // //python -> if b! = 0:
        // if(b1=0){
        //     System.out.println("b is not 0");
        // }
        // if(a>c){
        //     System.out.println("a is greater than c");
        // }
        // if(a/c > 0){
        //     System.out.println("a/c is greater than 0");
        // }

        // //else if

        // if(b!=0){
        //     System.out.println("b is not 0");
        // }
        // else if (b!=3){
        //     System.out.println("b is not 3");
        // }
        // else if (b!=6){
        //     System.out.println("b is not 6");
        // }
        // else {
        //     System.out.println("all else failed...");
        // }


        // gradeChecker();
        // evenOddChecker();
        // evenOddChecker(999);
        insideTriangle();
    }
    private static void gradeChecker(){
        Scanner ui = new Scanner(System.in);

        System.out.println("What was your grade?");
        int grade = ui.nextInt();            

            
        if(grade==100){
            System.out.println("A+");
        }
        else if (grade>=90){
            System.out.println("A");
        }
        else if (grade>=80){
            System.out.println("B");
        }
        else if (grade>=70){
            System.out.println("C");
        }
        else if (grade>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

        ui.close();
    }

    private static void evenOddChecker(){
        Scanner ui = new Scanner(System.in);

        System.out.println("Gimme Dat Numberrrrr:");
        int numba = ui.nextInt();
        if(numba % 2 >=1){
            System.out.printf("%d is an odd number",numba); //use this format for homework
        }
        else{
            System.out.printf("%d is an even number",numba);
        }
        ui.close();
    }

    private static boolean evenOddChecker(int n){

        if (n%2==0){
            System.out.print(n +" is an even number");
            return true;
        }
        else{
            System.out.print(n +" is an odd number");
            return false;
        }
        
    }


    private static void insideTriangle(){
        Scanner ui = new Scanner(System.in);

        System.out.println("What is the x coordinate");
        int x = ui.nextInt();
        System.out.println("What is the y coordinate");
        int y = ui.nextInt();

        if(x<0){
            System.out.println("The X is a negative");
        }
        else if(y<0){
            System.out.println("The Y is a negative");
        }
        else if (x <=200 && y <=100){
            System.out.println("The point is inside the triangle");
        }
        else{
            System.out.println("The point is NOT inside the triangle");

        }
            ui.close();
    }
}

