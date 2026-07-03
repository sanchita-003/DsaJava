public class Shadowing {
    static int x =100;
    public static void main(String[] args) {
        System.out.println(x); // using class-level

        int x=10; //local variable
        System.out.println(x);//this low-level scope overshadowed the high-level scope
    }
}
