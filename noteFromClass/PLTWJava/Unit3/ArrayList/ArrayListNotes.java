import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNotes {
    
    public static void main(String[] args){
        /*
        //Declare <datatype> name     = new Constructor<datatype>;
        ArrayList            newList1 = new ArrayList();
        ArrayList <String>   newList2 = new ArrayList<String>();
        ArrayList <Integer>  newList3 = new ArrayList<Integer>();


        //add numbers to an ArrayList
        newList3.add(1);

        System.out.println(newList1);
        System.out.println(newList2);
        System.out.println(newList3);

        newList1.add(1);
        newList1.add("1");
        newList1.add("Kevin");
        newList1.add(3.14);

        System.out.println(newList1);

        //get items from ArrayList
        for(int i=0;i<newList1.size();i++){
            newList1.get(1);    //get item from the list
            //no more newList1[] -> This no work
            System.out.println(newList1.get(i).getClass().getName());   //type()
        }
        */
        //additionCalculator();
        myTurn();
    }

    public static void additionCalculator(){
        Scanner ui = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();
        //while loop

        double newNumber=ui.nextDouble();
        while(newNumber!=0){
            numbers.add(newNumber);
            newNumber=ui.nextDouble();
        }

        double total=0.00;
        for(int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
            total+=numbers.get(i);
        }
        System.out.printf("You total is %f\n",total);
    }

        public static void myTurn(){
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("lizard");
        animalList.add("doggie"); 
        animalList.add("cat");

        Scanner in = new Scanner(System.in);
        String input="";
        int pos;

        while(!input.equals("q")){
            System.out.println(animalList);
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace or (q)uit?");
            input = in.nextLine();

            if(input.equals("a")){
                System.out.println("Enter an animal: ");
                input =in.nextLine();
                animalList.add(input);

            }
            else if(input.equals("i")){
                System.out.println("Enter an animal: ");
                input = in.nextLine();
                System.out.println("Enter a pos: ");
                pos = in.nextInt();
                //add position, item

                if(pos>0 && pos<animalList.size()){
                animalList.add(pos-1,input);
                }

            }
            else if(input.equals("r")){
                System.out.println("Enter an animal to remove: ");
                input = in.nextLine();
                animalList.remove(input);
            }
            else if(input.equals("p")){
                System.out.println("Enter an animal: ");
                input = in.nextLine();
                System.out.println("Enter a pos: ");
                pos = in.nextInt();
                if(pos>0 && pos<animalList.size()){
                    animalList.set(pos-1,input);
                }
            }
            else if(input.equals("c")){
                System.out.println("are you sure?");
                input = in.nextLine();
                if (input.equals("yes")){
                    animalList.clear();
                }
            }


        }

    }
}
