import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int [] nums = { 8 , 5 , 2 , 6 , 7 , 1 , 3 , 4};
        System.out.println(Arrays.toString(nums));
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums , i , correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums , int start , int second){
        int temp = nums[start];
        nums[start] = nums[second];
        nums[second] = temp;
    }
}
