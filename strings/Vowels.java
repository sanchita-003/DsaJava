import java.util.Scanner;
public class Vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!!");
        String str = sc.nextLine();
        String lowerStr = str.toLowerCase();
        int count=0;
        for(int i = 0 ; i<=str.length()-1 ; i++){
            if(lowerStr.charAt(i)=='a' || lowerStr.charAt(i)=='e' || lowerStr.charAt(i)=='i' || lowerStr.charAt(i)=='o' || lowerStr.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("There are  " +count+ "  vowels in the string!!");
    }
}
