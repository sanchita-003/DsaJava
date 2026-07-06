import java.util.*;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Sanchita";
        char target = 'S';
        System.out.println(Arrays.toString(name.toCharArray()));

        LinearSearch(name, target);
    }

    static void LinearSearch(String str , char target){
        if(str.length()==0){
            System.out.println("String is Empty");
        }
        else{
            for(int i=0 ; i<str.length() ; i++){
                if(target==str.charAt(i)){
                    System.out.println("Found!");
                }
            }
        }
    }
}
