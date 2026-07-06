import java.util.ArrayList;
import java.util.Arrays;

public class Even {
    public static void main(String[] args) {
        int[] arr = { 100 , 23 , 46 , 30 , 67 , -20 , 11};
        int ans=evenNum(arr);

        System.out.println("there are "+ans+" elements which are even in this array! \n And those elements are : ");
        printEven(arr);

    }

    //this will give the count of even numbers
    static int evenNum(int[] num){
        int count=0;
        if(num.length==0){
            return 0;
        }
        else{
            for(int element : num){
                if(even(element)){
                    count++;
                }
            }
        }
        return count;
    }
    static boolean even(int num){
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //this will print the arr containing all even numbers from that array
    static void printEven(int[] num){
        ArrayList<Integer> result = new ArrayList<>(); //to print in array form

        if(num.length==0){
            System.out.println("The array is empty!!");
        }
        else{
            for(int element : num){
                if(even(element)){
                    result.add(element);
                }
            }
            System.out.print(result);
        }
    }
}
