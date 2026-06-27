import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of \nEnglish\nHindi\nMathematics\nHistory\nGeography\nin the same order!!");
       
        int []marks = new int[5];
        for(int i=0;i<5;i++){
          marks[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<5;i++){
          total+=marks[i];
        }
        
        double percentage = (total/500.00)*100.00;

        if(percentage>=90){
            System.out.println("Congratulations!! \nYou are passed with grade O and .....");
        }
        else if(percentage>=80){
             System.out.println("Congratulations!! \nYou are passed with grade  A and .....");
        }
        else if(percentage>=70){
             System.out.println("Congratulations!! \nYou are passed with grade B and .....");
        }
        else if(percentage>=60){
             System.out.println("Congratulations!! \nYou are passed with grade C and ......");
        }
        else if(percentage>=50){
             System.out.println("Congratulations!! \nYou are passed with grade D and ......");
        }
        else if(percentage>=40){
             System.out.println("Congratulations!! \nYou are passed with grade E and.....");
        }
        else{
             System.out.println("Better luck next Time!! \nYou are Failed with .....");
        }
       
        int highest = marks[0];
        for(int i =0;i<5;i++){
          if(marks[i]>highest){
               highest=marks[i];
          }
        }
        System.out.println("Your highest marks is:"+highest);
        System.out.println("The total score "+total);
        System.out.println("And The percentage is "+percentage+"%");
    }
}
