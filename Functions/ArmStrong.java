public class ArmStrong {
    public static void main(String[] args) {
        for(int i =0 ; i<1000 ;i++){
            int sum=0;
            int n=i;
            while(n>0){
                int rem = n%10;
                sum=sum+rem*rem*rem;
                n=n/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
