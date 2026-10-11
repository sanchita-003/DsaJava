import java.util.ArrayList;
import java.util.List;
public class Permutations {
    public static void main(String[] args) {
        // permutation("" , "abcd");
        System.out.println(permutationsList("", "abcd"));
        System.out.println(permutationsCount("", "abcd"));
    }
    static void permutation(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0 , i);
            String l = p.substring(i , p.length());
            permutation(f+ch+l, up.substring(1));
        }
    }
    static List<String> permutationsList(String p , String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0, i);
            String l = p.substring(i);
            list.addAll(permutationsList(f+ch+l, up.substring(1)));
        }
        return  list;
    }
    static int permutationsCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0, i);
            String l = p.substring(i);
            count += permutationsCount(f+ch+l, up.substring(1));
        }
        return count;
    }
}
