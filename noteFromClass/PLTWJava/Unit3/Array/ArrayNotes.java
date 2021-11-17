import java.util.Scanner;
public class ArrayNotes {
    public static void main(String[] args){



        /*
            Python - List
                listy=[1,22,"string or something", [1,2,3],True,func()]
                listy[2] -> "string or something"
                listy[2] = "something else"
                listy=[1,22,"something else", [1,2,3],True,func()]

            Data Types:
                Boolean
                Integers
                Floats
                Array
                String
                Dictinary
                Tuple

        */
        //datatype [] nameOfArray = {the data}
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        double[] decimalNumbers={1.1,2.2,3.3,4.4,5.5,6.6};

        //python
        //empty list -> listy=[]
        int[] emptyNumbers;
        int[] emptyNumbers2 = new int [28];
        double[] emptyDeciNumbers2 = new double[28];
        String[] emptyStringNumbers = new String[28];

        int[] rando={1,2,3,4,5,6,7,8,9};
        // addEven(rando);


        //System.out.println(numbers);          cannot print the array
        // System.out.println(decimalNumbers);  cannot prunt the array
        //System.out.println(emptyNumbers);     litterally there's nothing there
        // System.out.println(emptyNumbers2);   cannot print the array

        // printArray(numbers);
        // System.out.println();
        // printArray(decimalNumbers);
        // System.out.println();
        // printArray(emptyNumbers2);
        // System.out.println();
        // printArray(emptyDeciNumbers2);
        // System.out.println();
        // printArray(emptyStringNumbers);

        //gpaCalculator();


    }




    private static void gpaCalculator(){
        //ask user for 5 grades
        Scanner sc = new Scanner(System.in);
        double[] grades = new double[5];
        for(int i=0;i<5;i++){
            System.out.println("Gimme da numba");
            double g = sc.nextDouble();
            grades[i]=g;
            //save them in an array
        }

        //print out the average of the 5 grades
        //average = sum of the list divided by the number of the list
        double t = 0;
        for(int i=0;i<grades.length;i++){
            t +=grades[i];
        }
        double gpa = t/5;
        
        //print out the grades
        printArray(grades);
        System.out.println(gpa);
    }
    private static void addEven(int[] listy){
        for(int i=0;i<listy.length;i++){
            if(listy[i]%2==0){
                listy[i]+=10;
            }
        }
        printArray(listy);
    }
    private static void printArray(int[] listy){
        for(int i=0;i<listy.length;i++){
            System.out.print(listy[i]+" ");
        }
    }
    private static void printArray(double[] listy){
        for(int i=0;i<listy.length;i++){
            System.out.print(listy[i]+" ");
        }
    }
    private static void printArray(String[] listy){
        for(int i=0;i<listy.length;i++){
            System.out.print(listy[i]);
        }
    }


}
