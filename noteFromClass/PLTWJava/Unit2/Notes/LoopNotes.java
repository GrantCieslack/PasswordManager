import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;
public class LoopNotes {
    public static void main(String[] args){
        // //while condish statement
        // // while(true){
        // //     //body of the loop
        // //     System.out.println("HI");
        // // }


        // //printing out 1-10
        // // int i = 1;
        // // while (i<11){
        // //     System.out.print(i+", ");
        // //     i++;
        // // }
        // // //for i in the range(10)
        // // //print(i+1)

        // // //1 to 10
        // // System.out.println();


        // //for(the number j; loop until; step count)
        // int j=1;
        // while(j<11){
            
        //     if(j<10){
        //         System.out.print(j+", ");
                
        //     }
        //     else if(j==10){
        //         System.out.print(j);
        //     }
        //     j++;
        // }



        // //10 to 1
        // // for(int k=10;k>0;k--){
        // //     System.out.print(k+", ");
        // // }

        // int c=1;
        // while(c<11)System.out.println(x);

            //minMaxChecker();
            basicStats();
    }

    private static void minMaxChecker(){
        Scanner ui = new Scanner(System.in);
        
        System.out.println("Enter NUmber >:(");
        int in = ui.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(in!=-1){
        System.out.println("Enter NUmber >:(");
        in = ui.nextInt();
            if(in>max){
                max = in;
            }
            else if(in<min){
                min = in;
            }
        }

        System.out.println("Max: "+max+"  Min: "+min);
        ui.close();
    }
    
    private static void basicStats(){     
        //loop until the user enters q
        //find the min and max, average, and total
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter NUmber >:(");
        String in = ui.nextLine();

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int total=0;
        int avg=0;
        int count=0;
        
        while(!in.equals("q")){
            total+=Integer.valueOf(in);
            count++;
            

            if(Integer.valueOf(in)>max){max = Integer.valueOf(in);}
            else if(Integer.valueOf(in)<min){min = Integer.valueOf(in);}

            System.out.println("Enter NUmber >:(");
            in = ui.nextLine();
        }
        avg = total/count;

        System.out.println("Max: "+max+" Min: "+min+" Avg: "+avg+" Total: "+total);
        ui.close();

    }
}
