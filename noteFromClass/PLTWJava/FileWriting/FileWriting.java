//Fuse the FileOutputStream
import java.io.*;

import javax.imageio.stream.FileImageOutputStream;

public class FileWriting {
    public static void main(String[] args) throws IOException{
        //try to do this
        try (FileOutputStream output = new FileOutputStream("temp.txt");){
            //if it works do this
            for(int i=0;i<100;i++){
                int rando = (int)(Math.random()*10);
                output.write(rando);
                byte comma = 44;
                output.write(comma);
            }
        }
        //if it fails... throw the IOException

        //read  in the numbers from temp.txt
        try(FileInputStream input = new FileInputStream("temp.txt");){
            //we know that temp.txt has int and bytes

            //loop through to render the ints and bytes
            int value;
            //input.read() returns -1 if there is no more information
            while((value=input.read())!=-1){
                if(value!=44){
                    System.out.println(value);
                }
            }
        }
    }
}