import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        String s = "Vaishanavi";
       System.out.println('a' + 'b');
       //both are char so java will convert them into int i.e a = 97 & b = 98 and then will perform addition 195

       System.out.println("a" + "b");
       //both are strings so it will does concatenation , not addition

       System.out.println((char)('a'+1));
       // a will be converted into integer then will perform addition which will be 98 and then then
       System.out.println("a" + 3);

       System.out.println("Sanchita" + new ArrayList<>());//created empty arrayList

       System.out.println("Sanchita" + new Integer (20));//object created and concated the no 20 with "Sanchita" 
       
       System.out.println(new Integer(03) + " " + new ArrayList<>());
    }
}
