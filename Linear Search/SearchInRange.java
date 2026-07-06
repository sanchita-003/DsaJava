import java.util.*;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {21 , 67 ,34 , 80 , 41 ,0};
        int target = 34;

        int index = LinearSearch(arr , target , 2 , 4 );

        System.out.println("Element found at index : "+index);
    }
    static int LinearSearch(int[] num , int target ,int start ,int end){
        if(num.length==0){
            return -1;
        }
        else{
            for(int index = start ; index <= end ; index++){
                if(target==num[index]){
                    return index;
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}
