import java.util.Scanner;

public class ScarBunny {
    public static void main(String[] args){
        
        
    //to convert decimal to binary
        System.out.println("Conversion of decimal to binary .....");
        System.out.print ("Enter your decimal number : ");
        Scanner sc = new Scanner(System.in);
        int deci = sc.nextInt();
        sc.close();
        System.out.println("converted binary number is "+Integer.toBinaryString(deci));
    }
        
}