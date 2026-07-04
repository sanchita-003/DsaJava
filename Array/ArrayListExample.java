import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5); //new arraylist

    /*    list.add(20); //adding the elements
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);//added one extra
        
        System.out.println(list);

        System.out.println(list.contains(20));//gives boolean ouput

        list.remove(2);//removes the value on 2nd index
        System.out.println(list);
*/
        System.out.println("enter the list: ");

        //taking input from user

        for(int i =0; i<5 ; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

         System.out.println(list.get(0));//to get the no on specific index
    }
}