public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
    static int search(int nums[] , int target , int start , int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/ 2;
        if(target < nums[mid]){
            return search(nums, target, start, mid-1);
        }
        else if(target == nums[mid]){
            return mid;
        }
        else{
            return search(nums, target, mid+1, end);
        }
    }
}
