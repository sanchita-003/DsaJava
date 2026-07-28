import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name= "Sanchita Rathod";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println("    Sanchu      ".strip());
        System.out.println(name.indexOf('R'));
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
