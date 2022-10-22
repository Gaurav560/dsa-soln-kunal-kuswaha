import java.util.Scanner;

public class q1_solution {
    public static void main(String[] args) {
        //program to find whether the number entered by the user is even or odd
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to check if it is odd or even:  ");
        int num=sc.nextInt();
        if (num>=0){
        if (num%2==0){
            System.out.println("the no is even");

        }else{
            System.out.println("the no is odd.");
        }
    }
        else {
            System.out.println("invalid number ");
        }
}}
