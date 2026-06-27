//Prime Numbers from 1 to 100
public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Printing the prime numbers from 1 to 100");
        for(int i = 1 ; i < 101 ; i++){
            boolean isPrime=true;
            
            for(int j=2 ; j < i ; j++){
                if(i%j==0){
                isPrime=false;
                break;
                }
            }
            if(isPrime==true && i>1){
                System.out.print(i+"    ");
            }
        }
    }
}
