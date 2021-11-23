public class Categories {
    String title;
    String userName;
    String passWord;
    String category;
    public Categories(){
        title = "untitled account";
        userName = "no username";
        passWord = "no password";
        category = "no category";
        System.out.println("Object Created");
    }
    public Categories(String t, String un, String pw, String c){
        title = t;
        userName = un;
        passWord = pw;
        category = c;
    }
    
}
