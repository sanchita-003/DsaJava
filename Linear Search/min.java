import java.util.Arrays;

public class min {
    public static void main(String[] args) {
        int[] arr = {12 , 4 , -600 , 30 , 2 , 01 , -20};
        int ans=min(arr);

        System.out.println(ans);

    }
    static int min(int[] num){
         int min=num[0];
        if(num.length==0){
            return Integer.MIN_VALUE;
        }
        else{
            for(int element : num){
               if(element<min){
                min=element;
               }
            }
        }
        return min;
    }
    
}
