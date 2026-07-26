import java.util.ArrayList;

public class AllMissing {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1 , 6 ,7 , 3 , 1};
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
        ArrayList<Integer> missing = new ArrayList<>();
        for(int index = 0 ; index < nums.length ; index++){
            if(nums[index] != index+1){
                missing.add(index+1);
            }
        }
        System.out.println(missing);
    }
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
