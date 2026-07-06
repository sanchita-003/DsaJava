import java.util.Arrays;

public class Demo{
    public static void main(String[] args) {
        int[] arr = { 23 , 45, -15 , 66 , 93 , 67 , 33 , 10};
        int target = -15;

        boolean ans=LinearSearch1(arr, target);
        System.out.println(ans);

        int ans2=LinearSearch2(arr, target);
        System.out.println(ans2);

        int ans3=LinearSearch3(arr, target);
        System.out.println(ans3);
    }

    //linear search who will return boolean value
    static boolean LinearSearch1(int num[] , int element){
        if(num.length==0){
            return false;
        }
        else{
            for(int target : num){
                if(target==element){
                    return true;
                }
            }
        }
        return false;
    }

    //this method will return the element 
    static int LinearSearch2(int[] num , int element){
        if(num.length==0){
            return -1;
        }
        else{
            for(int target : num){
                if(target==element){
                    return target;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    //this method will return the index of the targeted element
    static int LinearSearch3(int[] num , int element){
        if(num.length==0){
            return -1;
        }
        else{
            for(int index = 0 ; index<num.length ; index++){
                int target=num[index];
                if(target==element){
                    return index;
                }
            }
        }
        return -1;
    }
}
