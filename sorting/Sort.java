import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int [] nums = { 0 , 9 , 8 , 7 ,6 , 5 ,4 ,3 , 2 ,1};
        System.out.println(Arrays.toString(nums));

       // insertion(nums);
       // System.out.println(Arrays.toString(nums));

       selection(nums);
       System.out.println(Arrays.toString(nums));
    }

    //bubble sort function
    static void bubble(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            boolean swapped = false;
            for(int j = 1 ; j<arr.length-i ; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                }
            }
        }
    }

    //swap function
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //insertion sort function
    static void insertion(int[] arr){
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = i+1 ; j>0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

    //maxvalue
    static int getMax(int[] arr , int start , int end){
        int max = start;
        for(int i = start ; i<=end ; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    //selection sort function
    static void selection(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            int last = arr.length-i-1;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, last, maxIndex);

        }
    }
    
}