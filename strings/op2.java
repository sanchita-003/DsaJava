import java.util.Arrays;

public class op2 {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name);//it will print the null as string is null

        System.out.println(10);
        //simple integer print

        System.out.println(Arrays.toString(new int[]{1 , 2 , 3 , 4}));
        //created the array and printed in readable format

        Integer num = new Integer(13);
        System.out.println(num.toString());
        //created the object and printed
        System.out.println(num);//it can also directly call to string

        
    }
}
