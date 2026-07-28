public class firstMissing {
    public static void main(String[] args) {
        int nums[] = {0 , -1 , -2 , 1};
        int i = 0 ;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums , i , correct);
            }
            else{
                i++;
            }
        }
        for(int index = 0 ; index < nums.length ; index++){
            if(nums[index] != index+1){
                System.out.println(index+1);
                return;
            }
        }
        System.out.println(nums.length+1);
    }
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
