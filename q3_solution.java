package com.kunalKushwaha.in;

import java.util.Scanner;

public class q3_solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number for which u want" +
                " to print the multiplication table: " );
        int number=sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int k=number*i;
            System.out.println(number+"*"+i+"="+k);
        }
    }
}
