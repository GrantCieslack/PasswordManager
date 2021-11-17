public class StringNotes {
    public static void main(String[] args){
        
        String name = "bobby"; //literal assignment
        String name2 = new String("bobby"); //class assignment or constructor
    
        System.out.println(name);
        System.out.println(name.concat(name2)); //concate using the method
        System.out.println(name + name2);       // adding more data for the JVM remember

        //string multiplier = "name"*3
        name+=name2;                             //concate
        // name-=name2;                            //anti-concate only in python
        System.out.println(name);
        name+=name2;                             //concate
        System.out.println(name);

        //implicite type conversion
        double age = 17.0;
        System.out.println("Your age is" +age); //easy or lazy way
        // System.out.println((double) "17");      

        /*
        main string methods 
        substring = get a section of the String
        indexOf = return the index of chr in a string
        equals = Strings can't use ==
        length = length of the string
        */

        String email = "roobert.edward@shoecarnival.com";
        String email2 = "johnathan.smith@shoecarnival.com";
        String email3 = "shelly.kim@shoecarnival.com";

        //print out the username
        System.out.println(email.substring(0,14));
        //where is that @
        System.out.println(email.indexOf("@")); //find the 1st occurance
        //dynamic print out the username
        System.out.println(email3.substring(0,email3.indexOf("@")));

        //to see their domain
        System.out.println(email2.substring(email2.indexOf("@")+1));

        //find the length of a string
        System.out.println(email.substring(0,email.indexOf("@")).length());
        System.out.println(email2.substring(0,email2.indexOf("@")).length());
        System.out.println(email3.substring(0,email3.indexOf("@")).length());
        
        //see if email1's and email2's usernames are the same
        System.out.println(email.substring(0,email.indexOf("@")).equals(email2.substring(0,email3.indexOf("@"))));
          
        //see if email1's username's length is the same as email2's
        System.out.println(email.substring(0,email.indexOf("@")).length() == (email2.substring(0,email3.indexOf("@")).length()));
    }
}
