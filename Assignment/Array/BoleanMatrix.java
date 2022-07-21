package Assignment.Array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Boolean Matrix Problem
 */

public class BoleanMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        booleanMatrix(arr, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        in.close();
    }

    //method
    static void booleanMatrix(int[][] matrix,int m, int n){
        if (matrix == null || m == 0 || n == 0) {
            return;
        }

        int[] dummy1 = new int[m];
        int[] dummy2 = new int[n];
        
        Arrays.fill(dummy1, 0);
        Arrays.fill(dummy2, 0);

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    dummy1[i] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                if(dummy1[i] == 1){
                    matrix[i][j] = 1;
                }
            }
        }
    }
}
