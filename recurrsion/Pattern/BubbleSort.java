import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5 , 7 , 1 , 3 , 0};
        bubble(nums, 4, 0);
        System.out.println(Arrays.toString(nums));

    }
    private static void bubble(int[] nums , int r , int c){
        if(r == 0){
            return;
        }
        if(r > c){
            if(nums[c] > nums[c+1]){
                int temp = nums[c];
                nums[c] = nums[c+1];
                nums[c+1] = temp; 
            }
            bubble(nums, r, c+1);
        }
        else{
            bubble(nums, r-1, 0);
        }
    }
}
