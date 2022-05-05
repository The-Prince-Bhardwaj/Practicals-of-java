import java.util.Scanner;
public class Array1D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = sc.nextInt();
        // declaration of array 
        int [] a= new int [size];

        // taking input elements of array
        System.out.println("Enter elements of array : ");
        for (int i=0 ; i<a.length ; i++){
        int b = sc.nextInt();
        a[i]=b;}
            sc.close();
        //to show the elements of array.
        for (int i =0 ; i<=a.length ; i++)
        System.out.println("a[ "+i+" ]= "+a[i]);


        
    }
}