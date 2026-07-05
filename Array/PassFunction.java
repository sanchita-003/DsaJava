import java.util.Arrays;

public class PassFunction {
    public static void main(String[] args) {
        int[] arr = {1 , 20 , 30 , 40 , 50};
        System.out.println(Arrays.toString(arr));

        change(arr);//passed array in function named change

        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0] = 10;
    }
}
