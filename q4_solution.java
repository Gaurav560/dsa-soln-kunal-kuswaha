import java.util.Scanner;

public class q4_solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        float num1=sc.nextInt();
        System.out.println("enter the second number");
        float num2=sc.nextInt();
        System.out.println("press 1 for addtion,2 for multiplication ,3 for division,4 for subtraction");
        int entry=sc.nextInt();
        int add=1;
        int mul=2;
        int divide=3;
        int subtract=4;

        if(entry==1){
            System.out.println("the addition of both the numbers is " + (num1+num2));
        }
         if (entry==2){
            System.out.println("the multiplication of both the numbers is"+(num1*num2));
        }
         if (entry==3) {
            System.out.println("the division of both the numbers is "+(num1/num2));}
         if(entry==4){
          //   int sub=num2-num1;
             System.out.println("the subtraction is"+(num1-num2));
         }




    }
}
