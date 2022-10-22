package com.kunalKushwaha.in;

import java.util.Scanner;

public class q4_solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("enter number 2: ");
        int num2=sc.nextInt();
        int gcd=1;
        int min=num1>num2?num2:num1;
        for (int i=1; i<=min; i++) {
            if (num1%i==0 && num2%i==0){
                gcd=i;
            }
        } System.out.println("gcd of both the numbers is "+gcd);

        double lcm=1;
        lcm=(num1*num2)/gcd;
        System.out.println("lcm of both the numbers is: "+lcm);
    }
}
