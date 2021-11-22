import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import javax.xml.crypto.Data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class PasswordLogin {

    private static final String LOGIN_FILE = "login.txt";
    private static Scanner in;
    private static BufferedWriter out;
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
    if(readString()!=null){
        //NEED TO FIX READSTRING DOING NEXT LINE
        login();
    }
    else{
        System.out.println("Welcome to the Password Manager!");
        System.out.println("Please enter username for new account:");
            String username=ui.nextLine();
        System.out.printf("Please enter password for %s:\n",username);
            String password=ui.nextLine();
        createUser(username, password);
    }
    saveAndClose();
    ui.close();
}

    public static void login() {
        Scanner ui = new Scanner(System.in);
        //read user/pass from file
        //compare results
        //allow or deny(3 tries!)
        int tries = 3;

        while(tries!=0){
        System.out.println("Please enter username:");
            String username=ui.nextLine();
        System.out.printf("Please enter password for %s:\n",username);
            String password=ui.nextLine();
        String userPass = username+","+password;
        String realUser=readString();
        if(userPass == realUser){
            System.out.println("login successful");
        }
        else{
        System.out.println(realUser);
        }
        tries--;
        if(tries==0){
            break;
        }
        }
    }

    public static void createUser(String user, String pass){
        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(LOGIN_FILE));
            } catch (Exception e) {
                System.err.println("Something went Wrong! createUser");
                e.printStackTrace();
            }
        }
        try {
            out.write(user+","+pass);
            out.newLine();
        } catch (Exception e) {
            System.err.println("Cannot write file!");
            e.printStackTrace();
        }
        System.out.println("successful creation");
    }

    public static String readString(){
        //check if file exists
        if(LOGIN_FILE == null){
            return null;
        }
        //check to see if you are already reading
        if(in == null){
            try{
                in = new Scanner(new File(LOGIN_FILE));
            }
            catch(Exception e){
                System.err.println("Cannot Open file for input");
                e.printStackTrace();
            }
        }
        //read in values from the text file
        try{
            //check to see if in hasNext line
            if(in.hasNext()){
                String s = in.nextLine();
                return s;   //grabbing everything
            }
            else{
                return null;
            }
        }
        catch(Exception e){
            System.err.print("Cannot read the file");
            e.printStackTrace();
        }
        return null;
    }

    public static void saveAndClose(){
        //closes after scanner is done reading the file
        if(in!=null){
            try {
                in.close();
                in = null;
            } catch (Exception e) {
                System.err.println("Cannot close input file!");
                e.printStackTrace();
            }
        }
        //clases after the bufferedwriter is done writing to the file
        if(out!=null){
            try{
                out.close();
                out=null;
            }
            catch(Exception e){
                System.err.println("Cannot close output file!");
                e.printStackTrace();
            }
        }
    }
}
