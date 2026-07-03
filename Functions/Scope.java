// Demonstrates variable scope in Java - block scope, loop scope, and method scope
public class Scope{
    public static void main(String[] args){
        int num = 10;
        String name = "Sanchita";
        {
 //           int num = 23; //this is already initialised thats why error here
            num = 100;
            name = "Campus"; //can change the variables value who was initialised outside of this block

            System.out.println(num+ " \n"+name);

            int a = 100; //declared inside the block
        }
//        System.out.println(a); 
// okay so i cant even print the varialbe which was initialised inside he block

    //    a = 50; //i cant change the variable initialised inside the block
      
    
    //scooping for loop

    for(int i=0;i<100;i++){
        int b = 20;
         name = "Sashzt";

    }
 //   System.out.println(b); //yes cant print the variable initialised inside the loop too
    System.out.println(name); //yes but can change the variable inside the loop
    }
}