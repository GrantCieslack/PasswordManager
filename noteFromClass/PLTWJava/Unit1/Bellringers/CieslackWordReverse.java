import java.util.Scanner;
public class CieslackWordReverse {
    public static void main(String[] args){
        wordReverse("word");
    }

    public static void wordReverse(String s){
        String output ="";
        for(int i=s.length()-1; i>=0 ;i--){
            output+=s.substring(i,i+1);
        }
        System.out.println(output);


    }
}
