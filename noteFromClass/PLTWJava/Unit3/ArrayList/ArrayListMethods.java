import java.util.ArrayList;
public class ArrayListMethods {

    public static void main(String[]args){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        //[1,2,0,3,2,4,2,1,0,2,0,1,3,2]
        int[] ia = {1,2,0,3,2,4,2,1,0,2,0,1,3,2};
        arrList=createArrayList(ia);
        int iaMin=minIntAL(arrList);
        // System.out.println(iaMin);
        int iaMax = maxIntAL(arrList);
        int iaAve = aveIntAL(arrList);

        //System.out.printf("Min: %d \nMax: %d \nAverage: %d",iaMin,iaMax,iaAve);

        //System.out.println(count(arrList, 0));
        System.out.println(mode(arrList));

    }

    public static ArrayList<Integer> createArrayList(int[] iarr){
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=0;i<iarr.length;i++){
            temp.add(iarr[i]);
        }

        return temp;
    }

    //determin the min value in arraylist
    public static int minIntAL(ArrayList<Integer> temp){
        int min=Integer.MAX_VALUE;

        for(int i=0;i<temp.size();i++){
            if(min>temp.get(i)){
                min = temp.get(i);
            }
        }

        return min;
    }
    //determine the max vale in arraylist
    public static int maxIntAL(ArrayList<Integer> temp){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<temp.size();i++){
            if(max<temp.get(i)){
                max = temp.get(i);
            }
        }

        return max;
    }
    //determine the avg value in arraylist
    public static int aveIntAL(ArrayList<Integer> temp){
        int ave = 0;
        for(int i=0;i<temp.size();i++){
            ave += temp.get(i);
        }

        return ave/temp.size();
    }

    public static int count(ArrayList<Integer> temp, int valueToCheck){
        int count = 0;
        //for each loop
        for(int i: temp){
            //if only 1 line then, curly braces are optional
            if (i==valueToCheck){
                count++;}
        }
        if(count>0){
            return count;
        }else{
            return -1;
        }
    }

    //Determine the mode of a certain property
    /*
    public static int mode(ArrayList<Integer> temp){
        int mode = 0;
        int modeValue = 0;
        ArrayList<Integer> modeCount = new ArrayList<Integer>();
        for(int n: temp){
            modeCount.add(0);
        }
        for(int n: temp){

            modeCount.set(n,(modeCount.get(n)+1));
            if(modeCount.get(n)>modeValue){
                modeValue = modeCount.get(n);
                mode = n;
            }
        }

        return mode;
    }
    */

    public static int mode(ArrayList<Integer> temp){
        int mode = 0;
        //unique values in the list
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        uniqueList=removeDuplicates(temp);
        //a list of 0's
        ArrayList<Integer> countList = new ArrayList<Integer>();
        for(int n:uniqueList){
            countList.add(0);
        }
        //values in original list
        for(int n: uniqueList){
            int c = count(temp,n);
            countList.set(countList.get(n),c);
        }
        //set the countList to the count
        int modeValue=maxIntAL(countList);

        //set mode to the index of uniqueList[countList]
        mode =uniqueList.get(countList.get(modeValue));


        return mode;
    }

    //Remove the duplicates of the int AL
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> temp){
        ArrayList<Integer> out = new ArrayList<Integer>();
        
        for(int n: temp){
           if(!out.contains(n)){
               out.add(n);
           }
        }

        return out;
    }
}