public class Message {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("Hello");
        message2();
    }
    static void message2(){
        System.out.println("My name is");
        name();
    }
    static void name(){
        System.out.println("Sanchita");
    }
}
