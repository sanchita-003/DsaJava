class PowOfTwo {
    public static void main(String[] args){
        int n = 6;
        if((n & (n-1) )== 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}