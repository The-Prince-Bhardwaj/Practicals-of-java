   // package com.company;
    import java.util.Scanner;
    
    public class AddTwoNumbers{
        public static void main(String[] args) {
            int num1 , num2  , sum ;
            System.out.println("Takimg input from user");
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number 1 : ");
            num1 = sc.nextInt();

            System.out.print("Enter number 2 : ");
            num2 = sc.nextInt();

            sc.close();
            sum= num1 + num2 ;
            System.out.print("the sum of number : ");
            System.out.println(sum);
        }
    }