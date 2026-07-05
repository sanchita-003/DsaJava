import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] arr = { 1 , 2 , 3 , 4 , 5};
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] num){
        int start = 0 ;
        int end = num.length-1;

        while(start<end){
            swap( num , start , end);
            start++;
            end--;
        }
    }
    static void swap(int[] num , int a , int b){
        int temp = num[a] ;
        num[a] = num[b];
        num[b]=temp;
    }
}