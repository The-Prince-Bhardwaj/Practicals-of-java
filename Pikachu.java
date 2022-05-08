import java.util.Scanner;

public class Pikachu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row =sc.nextInt();

        System.out.print("Enter number of column : ");
        int column = sc.nextInt();

        int[][] ar = new int[row][column];
        System.out.println("Enter "+row*column+" elements of array : ");
          for(int i =0 ; i<row ; i++)
          {
              for (int j=0; j<column ; j++)
              {
                  ar[i][j]=sc.nextInt();
              }
          }
          //to show all elements of array
          sc.close();
          System.out.println("Elements of array are : ");
          for (int i =0 ; i<row ;i++)
                for(int j=0; j<column ; j++)
                System.out.println("a["+i+"]["+j+"]= "+ar[i][j]);
            }
        
}
