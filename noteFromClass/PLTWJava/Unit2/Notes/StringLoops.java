import javax.swing.tree.RowMapper;

public class StringLoops {
    
        public static void main(String[] args){
            // howMany("GIGGLING", "G");
            // spaceFinder("Hello.  This.  IS.  A.  PlaceHolder.  ");
            // spaceFinder("Hello.  This.  IS.  A.  PlaceHolder.  ", "  ");
            removeVowels("giggling");
            /*
            s.replaceAll(" ", "  ")
                first arg is what youre looking for
                second arg is what you replace it with
            */

        }
        private static void howMany(String s, String v){
            int count=0;
            for(int i=0; i<s.length();i++){
              
                if(s.substring(i,i+1).equals(v)){
                    count+=1;
                }
            }
            System.out.println(count);
        }

        private static void spaceFinder(String s){
            int count=0;
            String output ="";
            for(int i=0; i<s.length()-1;i++){
              
                if(s.substring(i,i+2).equals("a")){
                    count++;
                    output+=" ";
                    i++;
                }else{
                    output+=s.substring(i,i+1);
                }
            }
            System.out.println(count);
            System.out.println(output);


        }

        private static void spaceFinder(String s, String f){
            //while loop
            while(s.indexOf(f) != -1){  //loop while index of(f) finds an f
                s = s.substring(0, s.indexOf("  ")) +
                    s.substring(s.indexOf("  ")+1);
            }
            System.out.println(s);
        }

        private static void removeVowels(String s){
            //vowels = a,e,i,o,u,sometimes y (50% probability)
            String output="";
            if (Math.random()>.5){
                 for(int i=0;i<s.length();i++){
                      String x = s.substring(i,i+1);
                      //check to see if it a vowel, if it isn't then concatenate to an output
                      // if(oppositeOf(thisWillFindaeiou))
                      if(!(x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u"))){
                           output+=x;
                           System.out.println(x);
                      }
                 }
            }
            else{
                 for(int i=0;i<s.length();i++){
                      String x = s.substring(i,i+1);
                      //check to see if it a vowel, if it isn't then concatenate to an output
                      if(!(x.equals("y") || x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u"))){
                           output+=x;
                      }
                 }
            }
            System.out.println(output);
       }
    }   