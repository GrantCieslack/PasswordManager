public class MediaPlayer {
    
    public static void main(String[]args){
        
        // Songs s1 = new Songs();
        // //call the parameters of an object
        // System.out.println(s1.title);
        // System.out.println(s1.artist);
        
        // Songs s2 = new Songs("funky town", "lipps inc");
        // //call the parameters of an object
        // System.out.println(s2.title);
        // System.out.println(s2.artist);

        // Songs s3 = new Songs("creature", "half alive");
        // System.out.println(s3.title);
        // System.out.println(s3.artist);

        // s3.setTitle("song2");   //correct way to reset a variable
        // System.out.println(s3.title);
        // s3.title="too steep";   //not correct way to reset a varible
        // System.out.println(s3.title);

        // System.out.println(s1.getTitle());  //correct way to obtain obj patameters
        // System.out.println(s1.getArtist());
        // System.out.println(s1.getRating());


        Books b1 = new Books();
        b1.setTitle("Lord of the Rings");
        b1.setAuthor("Tolkien");
        b1.setRating(10);
        System.out.println(b1.getTitle());  //correct way to obtain obj patameters
        System.out.println(b1.getAuthor());
        System.out.println(b1.getRating());

        Books b2 = new Books();
        b2.setTitle("The Great Gatsby");
        b2.setAuthor("F. Scott Fitzgerald");
        b2.setRating(0);
        System.out.println(b2.getTitle());  //correct way to obtain obj patameters
        System.out.println(b2.getAuthor());
        System.out.println(b2.getRating());
    }
}
