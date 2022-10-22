import java.util.Scanner;

public class q6_solution {
    public static void main(String[] args) {
        //input currency in rupees and output in dollars
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount in rupees you want to convert in dollars:");
        float rupees=sc.nextFloat();
        float dollars=rupees/82.27f;
        System.out.println(dollars+ " dollars");
    }
}
