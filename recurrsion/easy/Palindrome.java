public class Palindrome {
    static int reverse(int n){
        int digit = (int)Math.log10(n);
        return helper(n , digit);
    }

    private static int helper(int n , int digit){
        if(n == 0){
            return n;
        }
        int lastDigit = n%10;
        return lastDigit*(int)Math.pow(10, digit)+helper(n/10, digit-1);
    }
    
    static boolean palindrome(int n){
        int rev = reverse(n);
        if(n == rev){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }

}
