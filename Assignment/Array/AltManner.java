package Assignment.Array;

import java.util.Scanner;

/*
 * Alternate Manner Matrix Traversal
 */

public class AltManner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        } 
        sc.close();

        for(int i=0;i<arr.length;i++)
        {

          if((i+1)%2!=0)
          {
            for(int j=0;j<arr[i].length;j++)
            {
              System.out.print(arr[i][j] +" ");

            }
          }
          else

          for(int j=arr[i].length-1;j>=0;j--)
            {
              System.out.print(arr[i][j] +" ");
            }
        }
    }
}


