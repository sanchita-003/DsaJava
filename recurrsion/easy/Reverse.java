public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse2(12345));
    }

    //regular method
    static int reverse(int n){
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev*10 + rem;
            n /= 10;
        }
        return rev;
    }

    //2nd method
   static int reverse2(int n){
    if(n == 0){
        return n;
    }
    int digit = (int)Math.log10(n) + 1;
    return helper( n , digit);
   }

   private static int helper(int n , int digit){
    if(n%10 == n){
        return n;
    }
    int rem = n%10;
    return rem*(int)(Math.pow(10, digit-1)) + helper(n/10 , digit-1);
   }
}
