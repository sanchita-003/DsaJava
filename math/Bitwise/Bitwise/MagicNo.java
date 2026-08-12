public class MagicNo {
    public static void main(String[] args) {
        int n = 101;
        int ans = 0;
        int base = 5;
        while(n > 5){
            int last = n & 1;
            ans += last*base;
            base *= 5;
            n = n >> 1;
        }
        System.out.println(ans);
    }
}
