import java.util.Arrays;
public class setMismatch {
    //Find the number that occurs twice and the number that is missing and return them in the form of an array.
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int index = 0 ; index < nums.length ; index++){
            if(nums[index] != index+1){
                System.out.println(Arrays.toString(new int[]{nums[index] , index+1}));
                return;
            }
        }
        System.out.println(Arrays.toString(new int[] {-1 , -1}));
    }
}
