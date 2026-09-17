import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        System.out.println(AsciiRet("", "ab"));
       // seqAscii("", "abc");
    }
    static void seq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        seq(p+ch, up.substring(1));
        seq(p , up.substring(1));
    }
    static ArrayList<String> seqArr(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = seqArr(p+ch, up.substring(1));
        ArrayList<String> right = seqArr(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static void seqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        seqAscii(p+ch, up.substring(1));
        seqAscii(p + (ch - 0), up.substring(1));
        seqAscii(p, up.substring(1));
    }
    static ArrayList<String> AsciiRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = AsciiRet(p+ch, up.substring(1));
        ArrayList<String> second = AsciiRet(p + (ch - 95), up.substring(1));
        ArrayList<String> third = AsciiRet(p, up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
