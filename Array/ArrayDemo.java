import java.util.Scanner;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //cearting array
        int[] arr = new int[5];
        arr[0]=10;   //inserting elements using index
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println(Arrays.toString(arr));

        int[] arr2={10 , 20 , 30 , 40 ,50 };
        System.out.println(Arrays.toString(arr2));
        
        //taking inout from user
        int[] arr3 = new int[5];
        System.out.println("Enter the array of 5 elements ");
        for(int i=0;i<5;i++){
            arr3[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr3));

        //now string array
        String[] arr4 = new String[5];
        for(int i=0;i<arr4.length;i++){
            arr4[i]=sc.next();
        }
        System.out.println(Arrays.toString(arr4));


    }
}
