import java.util.Arrays;

public class VarArg {
    static void fun(int ...v){ //dont know how many integers user will pass so ... which will create array
        System.out.println(Arrays.toString(v));
    }
    static void names(String ...v){
        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args){
        fun(10 , 20 , 30 ,40);

        names("Sanchita" , "Nikhil" , "Saloni");
    }
}
