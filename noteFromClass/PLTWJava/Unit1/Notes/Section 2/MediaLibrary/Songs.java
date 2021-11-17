public class Songs {
    //title, artist, rating, price, duration
    
    String title;
    String artist;
    int rating;
    double price;
    double duration;

    //Constructor
    public Songs(){
        title = "untitled track";
        artist = "artist unknown";
        System.out.println("Object Created");
    }
    public Songs(String t, String a){
        title=t;
        artist=a;
    }

    //methods
    //getter and setters or accessors and mutators
    public void setTitle(String t){
        //python was self.title = t;
        //this objects' title is now t;
        this.title = t;
    }

    public void setArtist(String a){
        this.artist = a;
    }

    public void setRating(int r){
        //this objects rating is now r;
        this.rating = r;
    }

    //getters - return values
    //publicSoAnyoneCanAccess DataTypeThatIsReturn functionName(){return info;}
    public String getTitle(){

        return title;
    }
    //create a getter for artist and rating
    public String getArtist(){
        return artist;
    }
    public int getRating(){
        return rating;
    }
}
