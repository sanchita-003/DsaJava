import java.util.Arrays;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 2 , 8 , 23 ,56  ,60};
        int target =6;
        boolean ans = binary(arr, target);
        System.out.println(ans);
    }

    //sort function
    static boolean binary(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1;

        while(start<=end){
         //   int mid = (start + end)/2; might throw error
         int mid = start + (end-start)/2;

         if(target==arr[mid]){
            return true;
         }
         else if(target < arr[mid]){
            end = mid-1;
         }
         else{
            start = mid+1;
         }
        }
        return false;
    }
}