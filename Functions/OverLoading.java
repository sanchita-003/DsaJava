public class OverLoading{

    static int sum(int a , int b){
        return a+b;
    }

    static int sum(int a , int b , int c){
        return a+b+c;
    }

    static void fun(String name){
        System.out.println("this is my name " +name);
    }

    static void fun(int a){
        System.out.println("You entered : "+a);
    }
    public static void main(String[] args){
      //  fun(67);

      // fun("sanchita");

     //System.out.println("Sum = "+sum(12,35,77));

     System.out.println("Sum = "+sum(12,8));

     // java itself choose which function will be appropiate for that particular operation!
    }
}