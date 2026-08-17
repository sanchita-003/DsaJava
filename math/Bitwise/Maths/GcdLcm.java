
public class GcdLcm {
    public static void main(String[] args) {
        System.out.println( GCD(4 , 9));
        System.out.println(lcm(4, 9));
    }
    static int GCD(int a , int b){
        if(a == 0){
            return b;
        }
        return GCD(a%b, a);
    }

    static int lcm(int a , int b){
        return (a*b) / GCD(a, b);
    }
}
