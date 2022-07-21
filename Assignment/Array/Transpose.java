package Assignment.Array;

import java.util.*;
/*
 * Transpose of the Matrix 
 */
public class Transpose
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        // int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
      transpose(arr, n);
      for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }

        sc.close();
	}

  public static void transpose(int[][] matrix,int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}