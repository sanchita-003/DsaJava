import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //intialising the arraylist
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        System.out.println(list);

        //taking input from user and storing in the blank spaces of arraylist 
        System.out.println("Enter the elements of list in order");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}