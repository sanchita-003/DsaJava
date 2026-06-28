import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sd(arr);
        System.out.println(arr); //adress of arr
        System.out.println(Arrays.toString(arr));
    }
    static void sd(int[] num){
        num[0]=99;
        System.out.println(num);//adress of num and arr is same!

    }
}
