import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] nums = {5 , 7 , 1 , 3 , 0};
        selection(nums, 5, 0 , 0);
        System.out.println(Arrays.toString(nums));
    }
    private static void selection(int[] nums , int r , int c , int max){
        if(r == 0){
            return;
        }
        if(r > c){
            if(nums[c] > nums[max]){
                selection(nums, r, c+1, c);
            }
            else{
                selection(nums, r, c+1, max);
            }
        }
        else{
            int temp = nums[max];
            nums[max] = nums[r-1];
            nums[r-1] = temp;
            selection(nums, r-1, 0, 0);
        }
    }
}
