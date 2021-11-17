public class HelloVariables {
    /*
        Primitibe Data = int, bits, bytes, boolean, float
        Non-Primitive Data = string, array, List, ArrayList
    */
    public static void main (String[] args){
        //datatype variableName = value;
        int age = 12;
        double cash = 5.25; //double is not just for 2 decimal points

        boolean isOldEnough = true; //namingsyntax typically begin with is
        
        //String is technically a class
        String name = "Billy";
        System.out.println(age);
        System.out.println(name+" is "+age+" years old.");

        //CONSTANT VARIABLE
        //naming convention - is all caps for us programmers
        final double PI = 3.1415926;

    }
}