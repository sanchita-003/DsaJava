public class EvenOdd {
    public static void main(String[] args) {
        int n = 25;
        if((n & 1) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
