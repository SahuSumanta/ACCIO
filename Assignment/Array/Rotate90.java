package Assignment.Array;

import java.util.Scanner;

/*
 * problem same as rotate image 90 degree
 * 
 */
public class Rotate90 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] arr = new int[m][n];
    for (int row = 0; row < m; row++) {
      for (int col = 0; col < n; col++) {
        arr[row][col] = sc.nextInt();
      }
    }

    rotate(arr);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }

  public static void rotate(int[][] matrix) {
    // transpose
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i; j < matrix[0].length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    // reverse
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix[0].length - j - 1];
        matrix[i][matrix[0].length - j - 1] = temp;
      }
    }
  }
}
