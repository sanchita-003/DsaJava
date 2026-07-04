import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number!");
        int num1 =sc.nextInt();

        System.out.println("Enter 2nd Number!");
        int num2 = sc.nextInt();

        swap(num1 , num2);

    }
    static void swap(int a , int b){
        System.out.println("before the swap numbers are num1 = "+a+" and num2 = "+b);

        int temp=a;
        a=b;
        b=temp;
        
        System.out.println("After the swap numbers will be num1 = "+a+" and num2 = "+b);
    }
}
