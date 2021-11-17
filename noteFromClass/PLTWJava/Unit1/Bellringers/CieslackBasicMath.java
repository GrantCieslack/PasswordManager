import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

class CieslackBasicMath {
    public static void main(String[] agrs) {
        Basicmath();
    }

    private static void Basicmath(){
        Random rand = new Random();
        Scanner ui = new Scanner(System.in);

        int i =10;
        int score = 0;
        while(i!=0){
        int y = (int)(Math.random()*5);   //math class random
        int signNum = rand.nextInt(4);
        int x = rand.nextInt(10)+1;     //random class version
        double answer = 0;
        double input = 0;
        if(signNum == 1){
            answer = (double)x/y;
            System.out.printf("What is %d / %d?",x,y);
            input = ui.nextDouble();
        }
        else if(signNum==2){
            answer = (double)x*y;
            System.out.printf("What is %d * %d?",x,y);
            input = ui.nextDouble();
        }
        else if(signNum==3){
            answer = (double)x-y;
            System.out.printf("What is %d - %d?",x,y);
            input = ui.nextDouble();
        }
        else{
           answer = (double)x+y;
            System.out.printf("What is %d + %d?",x,y);
            input = ui.nextDouble();
        }

        
        if(input == answer){
            System.out.println("Very NICEEEEEEEE!");
            score++;
        }
        else{
            //%s = string   %d = int    %f = float or double
            System.out.printf("Nope, its actually %d, you kinda suck at this",answer);
        }
        i--;
        if (i==0){
            System.out.printf("You got %d out of 10 correct",score);
        }
        
        }
    }
}