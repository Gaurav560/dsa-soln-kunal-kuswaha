import java.util.Scanner;

public class q9_Solution_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //to find armstrong number between two given numbers
        System.out.println("please the min range :");
        int minRange=sc.nextInt();
        System.out.println("please the max range :");
        int maxRange=sc.nextInt();
//         int remainder=0;
        int sum=0;
        for (int i=minRange;i<=maxRange;i++)
        {
            int temp = i;
//            System.out.println(i+",");
            sum = 0;
            while(temp!=0){
                int remainder=temp%10;
            sum+=remainder*remainder*remainder;
                temp=temp/10;``
            }
//            System.out.println(sum + ",");
           if (i == sum){
               System.out.println(i);
           }

        }


    }
}
