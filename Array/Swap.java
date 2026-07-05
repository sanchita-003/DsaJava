import java.util.Arrays;

public class Swap{
    public static void main(String[] args) {
        int [] arr = { 1 , 4 , 3 , 2 , 5};
        System.out.println(Arrays.toString(arr));

        swap(arr , 1 , 3);
        System.out.println(Arrays.toString(arr));
    
    }
    static void swap(int[] num , int index1 , int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }
}
