import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Student!!");
        String name = sc.nextLine();
        System.out.println("Enter the marks of \nEnglish\nHindi\nMathematics\nHistory\nGeography\nin the same order!!");
        int eMarks = sc.nextInt();
        int hMarks = sc.nextInt();
        int mMarks = sc.nextInt();
        int hisMarks = sc.nextInt();
        int gMarks = sc.nextInt();

        int total =(eMarks+hMarks+mMarks+hisMarks+gMarks);
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
        System.out.println("The total score "+total);
        System.out.println("And The percentage "+percentage+"%");
    }
}
