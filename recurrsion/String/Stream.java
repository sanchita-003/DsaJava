public class Stream {
    public static void main(String[] args) {
        // skip("", "bacapplcdah");
        System.out.println(skipAppnotApple("bacapplcdah"));
    }
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.print(p);
            return ;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skipString(String p , String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skipString(p, up.substring(1));
        }
        return skipString(p+ch, up.substring(1));
    }

    // static String skipAppnotApple(String up){
    //     if(up.isEmpty()){
    //         return "";
    //     }
    //     if(){
    //         return skipAppnotApple(up.substring(3));
    //     }
    //     return skipAppnotApple(up.substring(1));
    // }
}
