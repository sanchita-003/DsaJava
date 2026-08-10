public class FindUnique{
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(nums));
    }
    private static int ans(int[] nums){
        int unique = 0;
        for(int ele : nums){
            unique ^= ele;
        }
        return unique;
    }
}