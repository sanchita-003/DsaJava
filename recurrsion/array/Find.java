public class Find {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4, 4, 5};
        System.out.println(findIndexLast(nums , 5 , 0));
    }

    static boolean find(int[] nums , int target , int index){
        if(index == nums.length){
            return false;
        }
        return nums[index] == target || find(nums, target, index+1);
    }

    static int findindex(int[] nums , int target , int index){
        if(index == nums.length){
            return -1;
        }
        else if(nums[index] == target){
            return index;
        }
        else{
            return findindex(nums, target, index+1);
        }
    }

    static int findIndexLast(int[] nums , int target , int index){
        if(index == -1){
            return -1;
        }
        else if(nums[index] == target){
            return index;
        }
        return findIndexLast(nums, target, index-1);
    }
}
