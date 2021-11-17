import java.util.Scanner;
public class CieslackBellringer20211019 {
    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers would you like to add?");

        int x = in.nextInt();
        double[] numbers= new double[x];

        for(int i=0;i<numbers.length;i++){
        System.out.println("Enter number to add");
            double n = in.nextDouble();
            numbers[i]=n;
        }

        printArray(numbers);
        addArray(numbers);
    }

    private static void printArray(double[] listy){
        for(int i=0;i<listy.length;i++){
            System.out.print(listy[i]+" ");
        }
    }

    private static void addArray(double[] listy){
        double total=0;
        for(int i=0;i<listy.length;i++){
            total += listy[i];
        }
        System.out.print(total);
    }
}
