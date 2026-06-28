public class Reverse {
    public static void main(String[] args){
       int num = 12345;
       System.out.println("Number is : " +num);

       int ans=0;

       while(num>10){
        int rem=num%10;
        num/=10;
        ans = ans*10 + rem;

       }
       System.out.println(" Reverse num is : "+ans);
    }
}
