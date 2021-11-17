import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
public class CieslackU3S6 {

    public static void main(String[] args){
        int [] arrList = {1,5,16,61,111};
        int [] testList = {2,4,5,6};
        int [] mergedList;
        int[] ia = {1,2,3,2,1,6,3,4,5,2,3,6,8,9,9};
        //arrList=createArrayList(ia);
        // evenOddChecker(ia);

        mergedList=merge(arrList, testList);
        printArray(mergedList);

    }

    public static void evenOddChecker(int[] listy){
        int odd = 0;
        int even = 0;

        for(int i=0;i<listy.length;i++){
            if(listy[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.printf("# of Evens: %d \n# of Odds: %d",even,odd);
    }

    public static int[] merge(int[] list1, int[] list2){

        
            int [] temp = new int [9] ;
            //tracker for lists
            int L1 = 0;
            int L2 = 0;
            //for every item in the smaller list, check the larger one, put it second
            for(int i=0; i<list2.length;i++){
                // if(list2[L2]==0){
                //     temp[i]=list1[L1];
                // }
                //else 
                if(list1[L1]>list2[L2]){
                    temp[i]=list2[L2];
                    L2++;
                }
                else if(list1[L1]<list2[L2]){
                    temp[i]=list1[L1];
                    L1++;
                }
                else{
                    temp[i]=list2[L2];
                    L2++;
                }

                /*if(list1[L1]==list2[L2]){
                    temp[i]=list1[L1];
                    temp[i+1]=list2[L2];
                    L1++;
                    L2++;
                    i++; */
                System.out.println(i);
            }
            for(int i=L1;i<list1.length;i++){
                temp
            }
            // while(j<list1.length){
            //     temp[j]=list1[j];
            //     j++;
            // }

        return temp;
    }

    public static int[] createArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many ints do you want in the list?");
        int n = in.nextInt();
        int [] temp = new int [n]; 
        for( int i=0;i<n;i++){
            System.out.println("Enter #");
            int numb = in.nextInt();
            temp[i]=numb;
        }
        return temp;
    }

    private static void printArray(int[] listy){
        for(int i=0;i<listy.length;i++){
            System.out.print(listy[i]+" ");
        }
    }
    /* public static ArrayList<Integer> createArrayList(int[] iarr){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<iarr.length;i++){
            temp.add(iarr[i]);
        }
        return temp;
    }*/
}