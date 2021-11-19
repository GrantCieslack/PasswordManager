import java.util.Random;
import java.util.Scanner;
public class PasswordGen {
    private static void proc(String q,int s){
        Scanner ui = new Scanner(System.in);
        System.out.println("Question");
        String procedure = ui.nextLine();

    }
    private static int numberCheck(String q,String s){
        Scanner ui = new Scanner(System.in);
        s = 0;
        while(true){
            if(s==0){
                break;
            }
            System.out.println(q);
            s= ui.nextLine();
        ui.close();
        return s;
        }
    }
    private static string generate(){
        String output = "";
        
    }
}
