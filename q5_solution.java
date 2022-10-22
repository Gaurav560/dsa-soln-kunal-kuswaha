package com.kunalKushwaha.in;

import java.util.Scanner;
//keep taking inputs un till x is pressed
public class q5_solution {
    public static void main(String[] args) {
        String str="";
        Scanner sc=new Scanner(System.in);

       while(true){
           System.out.println("enter the number u wish to print:");
           int num=sc.nextInt();
           System.out.println("the number u have typed is "+num);
           System.out.println("if u wish to terminate the program type q or else anything");
           str= sc.next();
           if (str.equals("q"))
               break;

       }
        System.out.println("that's it.");


        }

}
