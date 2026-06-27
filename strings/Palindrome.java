import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!");
        String str = sc.nextLine();
        boolean isPalindrome=true;
        for(int i = 0 , j = str.length()-1 ; i<j ; i++ , j--){
            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome==false){
            System.out.println("The given string is not palindrome!!");
        }
        else{
            System.out.println("The given string is palindrome!!");
        }
    }
}
