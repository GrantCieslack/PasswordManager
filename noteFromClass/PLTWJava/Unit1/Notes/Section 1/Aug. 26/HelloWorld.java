// Single Line Comment
/*
    Comment Block
    JVM = Java Virtual Machine - This translates the java code to the computer
    Java is a grandobject of C
*/

//public = any file or class can access this class
//class = defines that the following code is is a class
//ClassName = First letter cap and same as the file
// https://www.geeksforgeeks.org/understanding-public-static-void-mainstring-args-in-java/
public class HelloWorld{
    public static void main(String[] args){
        //public means where and who can access the method
        //method = is a function that objects use. object.method notation
        //                                           noun.verb
        //static means we can run the method without creating an object
        //instantiation = creating that object
        //void means it will return nothing or it doesnt return
        //methodName = main
        //(String[] args) =data passed to the fuction specifically string array
        System.out.println("Hello World");
        //; are . in computer talk - the ; is the end of the sentence

        System.out.print("Howdy");
        System.out.print("Bonjour\n");      //\n is the new line
        System.out.print("Salute");
        System.out.print("\tSalute");       //\t is the tab

        System.out.println(5.1473);              
        System.out.printf("%5.2f%n",5.1473);    //fancy formatting   5.2 = 5 numbers on left of . 2 numbers on the right 
        System.out.printf("%3.2f%n",5678.1473);    

    }


}