import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        System.out.println("Enter 1st number!");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number!!");
        int num2=sc.nextInt();
        System.out.println("select which operatin u want to perform!\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
        int op=sc.nextInt();
        switch(op){
            case 1 : System.out.println("Addition of two Numbers will be : " +(num1+num2));
            break;
            case 2 : System.out.println("Substraction of two numbers will be :" +(num1-num2));
            break;
            case 3 : System.out.println("Multiplication of two numbers will be :" +(num1*num2));
            break;
            case 4 : System.out.println("division of two numbers will be : " +(num1/num2)+ " \nAnd remaider will be :"+(num1%num2));
            break; 
            default : System.out.println("You selected the wrong option.\n Please Select from above options!!");
            break;
        }
    }
}