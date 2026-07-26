import java.util.Arrays;
public class Duplicate{
    public static void main(String[] args){
        int [] nums = { 1 , 3 , 4 , 2 , 2};
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums , i ,correct);
                }
                else{
                    System.out.println(nums[i]);
                    break;
                }
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}