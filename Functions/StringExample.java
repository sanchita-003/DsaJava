import java.util.Scanner;
public class StringExample{
      static void greet(){
            System.out.println("Hey!!");
        }
    public static void main(String[] args){ //will not return anything
        Scanner sc = new Scanner(System.in);

        greet();

        System.out.println("Enter your name!!");
        String name = sc.nextLine(); //taking inout from user

        String personalised = toGreet(name); //passed name in the toGreet function
        System.out.println(personalised);
    }
    static String toGreet(String naam){ //will return a string 
       String message =(naam+" Welcome!! ");
       return message;
    }

}