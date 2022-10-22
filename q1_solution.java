package com.kunalKushwaha.in;

import java.util.Scanner;

public class q1_solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the year you want to check: ");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) ||(year%400==0 )){
            System.out.println("this is a leap year");
        }
        else {
            System.out.println("it is not a leap year");
        }
    }
}
