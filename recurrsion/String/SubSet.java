import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
         int[] arr = {1, 2, 2};
         System.out.println(subset(arr));
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
}
