import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num =sc.nextInt();
        int m =num/2, flag=0;
        if (num==0 || num==1){
            System.out.println(num+" is not a prime number .");
    }
    else{
        for (int i =2 ; i<m ; i++){
                if(num%i==0){
                    System.out.println(num+" is not a prime number.");
                    flag = 1;
                    break;
                }
        }
        if(flag==0){
            System.out.println(num+" is a prime number.");
        }
    }
   sc.close();
   try {
       if(num<0){
           System.out.println(num+" is a negative number and negitive of prime number is not possible.");
       }
   } catch (Exception e) {   
       System.out.println("Please retry..");
   }
   finally{
       System.out.println("Thank you...");
   }
    }
}