import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*  int[][] arr={
            {1,2,3},
            {2,3,4},
            {3,4,5},
        };
        System.out.println(Arrays.deepToString(arr));
         */

        int[][] arr = new int[3][3];
         // must specify both dimensions — otherwise rows are created but stay null,
        // and calling .length on a null row throws NullPointerException 


        System.out.println(arr.length);
        //taking inout from user and inserting in the 2d aray

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
