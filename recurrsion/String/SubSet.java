import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
         int[] arr = {1, 2 , 4 , 3 , 2, 3};
         System.out.println(subsetDupli(arr));
    }
    static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int ele : nums){
            int n = outer.size();
            for(int i = 0 ; i < n ; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(ele);
                outer.add(inner);
            }
        }
        return outer;
    }

    //for duplicate
    static List<List<Integer>> subsetDupli(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < nums.length ; i++){
            start = 0;
            if(i > 0 && nums[i] == nums[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j = start ; j < n ; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);

            }
        }
        return outer;
    }
}
