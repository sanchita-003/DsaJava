import java.util.Arrays;
class FilpImage{
    public static void main(String[] args) {
        int[][] nums = {{1,1,0} ,{1,0,1} , {0,0,0}};
        for(int[] row : nums){
            for(int i = 0 ; i < (nums[0].length-i+1)/2 ; i++){
                int temp = row[i]^1;
                row[i] = row[nums[0].length-i-1]^1;
                row[nums[0].length-i-1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}