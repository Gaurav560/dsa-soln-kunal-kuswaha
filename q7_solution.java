import java.util.Scanner;

public class q7_solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=0;
        int num2=1;
        int sum=0;
        System.out.println("enter the nth term up to which u want to calculate fibonacci series" +
                "\nnote:1st term starts from excluding first two numbers(0 and 1)");
        int nthTerm=sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        int i=1;
        while(i<=nthTerm){
            sum=num1+num2;
            System.out.println(sum);
            num1=num2;
            num2=sum;
            i++;
        }
    }
}
