public class Books {
    //title, author, rating

    String title;
    String author;
    int rating;

    //constructor
    public Books(){
        title = "untitled book";
        author = "author unknown";
        System.out.println("Object Created");
    }
    public Books(String t, String a){
        title=t;
        author=a;
    }

    //getters and setters
    public void setTitle(String t){
        this.title=t;
    }
    public void setAuthor(String a){
        this.author=a;
    }
    public void setRating(int r){
        this.rating=r;
    }

    public String getTitle(String t){
        return title;
    }
    public String getAuthor(String a){
        return author;
    }
    public int getRating(int r){
        return rating;
    }

    //create 1 object of the Book Class in MediaPlayer
    //  set the title, author
    //  set the title, author
}
