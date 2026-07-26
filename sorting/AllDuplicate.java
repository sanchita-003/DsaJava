import java.util.ArrayList;
import java.util.Arrays ;

public class AllDuplicate {
    public static void main(String[] args) {
        int[] nums= {4,3,2,7,8,2,3,1};
        // Arrays.sort(nums);

        int i = 0;
        while( i < nums.length){
            if(nums[i] != i+1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums , i , correct);
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        ArrayList<Integer> duplicate = new ArrayList<>();
        for(int index = 0 ; index < nums.length ; index++){
            if(nums[index] != index + 1){
                duplicate.add(nums[index]);
            }
        }
        System.out.println(duplicate);
    }
    static void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
