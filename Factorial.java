import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        int facto=1;
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        sc.close();
        for(int i=1 ; i<=a;i++)
        facto=facto*i;

        System.out.print("factorial of number "+a+" is " +facto);
        
    }
}