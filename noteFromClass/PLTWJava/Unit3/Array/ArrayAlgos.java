public class ArrayAlgos {
    
        public static void main (String[] args){
            double[] test = {12,7,13,8,4.0,3,72};
            // sum(test);
            // average(test);
            // min(test);
            // max(test);

            //new Player("Alex", 12, "Reitz")
            Player[] players = {new Player("Grant", 17, "Castle"), new Player("Aiden", 13, "Reitz"),
                     new Player("Chris", 15, "Harrison"), new Player("Charlie", 15, "Harrison") };
            
            // boolean hasValue = false;
            // int i=0;
            // while(!hasValue && i<(players.length-1)){
            //     if(players[i].getAge()>=18){
            //         hasValue=true;
            //         System.out.println(players[i].getName());
            //     }
            //     i++;
            // }
            //see all of the Reitz students
            boolean reitz = false;
            int j=0;
            while(!reitz && j<(players.length-1)){
                if(players[j].getSchool().equals("Reitz")){
                    reitz=true;
                    System.out.println(players[j].getName());
                }
                j++;
            }
            
        }

        private static void sum(double[] listy){
            double t = 0;
                for(int i=0;i<listy.length;i++){
                    t += listy[i];
                }
                System.out.println("sum: "+t);

        }
        
        private static void average(double[] listy){
                double t = 0;
                for(int i=0;i<listy.length;i++){
                    t += listy[i];
                }
                double avg = t/listy.length;
                System.out.println("avg: "+avg);
            
        }
        
        private static void min(double[] listy){
            double mini = Double.MAX_VALUE;
            for(int i=0;i<listy.length;i++){
                if(mini>listy[i]){
                    mini = listy[i];
                }
            }
            System.out.println("min: "+mini);
        }
        
        private static void max(double[] listy){
            double maxi = Double.MIN_VALUE;
            for(int i=0;i<listy.length;i++){
                if(maxi<listy[i]){
                    maxi = listy[i];
                }
            }
            System.out.println("max: "+maxi);
        }
}
