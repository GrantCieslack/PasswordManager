public class TimeLoop {
    
    public static void main(String[] args){
        //time start
        long tStart = System.currentTimeMillis();       
        //counter function     
        counter(1000000);
        //time finish
        long tFinish = System.currentTimeMillis();
        //difference between tStart and tFinish
        System.out.println((tFinish-tStart)+ "ms");
    }

    private static void counter(long x){
        System.out.println("Loop started");
        for(long i=0; i<x; i++){
            System.out.println(i);
        }
        System.out.println("Loop finshed");

        // System.out.println("Loop started");
        // long i=0;
        // while(i<x){
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("Loop finshed");

    }
}
