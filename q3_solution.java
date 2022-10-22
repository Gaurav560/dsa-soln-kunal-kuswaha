import java.util.Scanner;

public class q3_solution {
    //program to input principal time and rate of interest and find simple interest
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principal:");
        float principal =sc.nextFloat();
        System.out.println("enter the roi");
        float roi =sc.nextFloat();
        System.out.println("enter the time for u which u want to invest:");
        float time =sc.nextFloat();
        System.out.print("the simple interest is :");
        float si=(principal*roi*time)/100;
        System.out.println(si);

    }
}
