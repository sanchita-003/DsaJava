public class NoOfDigit {
    public static void main(String[] args) {
        int n = 10;
        int ans = (int)(Math.log(n) / Math.log(2))+1; //binary digits calculate karega
        
        System.out.println(ans);
    }
}
