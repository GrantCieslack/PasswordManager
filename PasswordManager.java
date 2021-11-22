import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args){
        PasswordLogin.main();
    }

    public static accessAccount(){
        Scanner ui = new Scanner(System.in);
        //display categories
        //allow to see passwords, add passwords, delete passwords, delete accounts,
        
        System.out.println("Would you like to: [view] a category, [add] a category, or [delete] a category");

        //go to category
        if(ui.nextline().equals("view")){
            System.out.println("Which Category?");
            viewCat(ui.nextLine());
        }

        if(ui.nextline().equals("add")){
            addCategory();
        }
        if(ui.nextline().equals("delete")){
            System.out.println("Which Category?");
            deleteCat(ui.nextLine());
        }
        
        //once category is selected
        

    }

    public static void viewCat(string c){

        System.out.println("Would you like to: [add] a password, [delete] a password, [change] a password");
        
    }

    public static void addCategory(){

    }

    public static void deleteCat(){
        
    }

}