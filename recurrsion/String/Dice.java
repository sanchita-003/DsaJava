import java.util.ArrayList;
public class Dice {
    public static void main(String[] args) {
       // dice( 6);
       //System.out.println(helperList(" ", 2));
       //diceface(" ", 4, 8);
       System.out.println(dicefaceret("", 3, 6));
    }

    static void dice(int target){
        helper(" ", target);
       // helperList(" ", target);
    }
    private static void helper(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1 ; i <= 6 && i <= target ; i ++){
            helper(p+i, target-i);
        }
    }
    private static ArrayList<String> helperList(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1    ; i <= 6 && i <= target ; i++){
            list.addAll(helperList(p+i, target-i));
        }
        return list;
    }

    static void diceface(String s , int target , int face){
        if(target == 0){
            System.out.println(s);
            return;
        }
        for(int i = 1 ; i <= face && i <= target ; i++){
            diceface(s+i , target-i, face);
        }
    }

    static ArrayList<String> dicefaceret(String p , int target , int face){
        if(target == 0){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1 ; i <= 6 && i <= target ; i++){
            list.addAll(dicefaceret(p+i, target-i, face));
        }
        return list;    
    }
}
