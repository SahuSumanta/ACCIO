package Assignment.Array;

import java.util.Scanner;

/**
 * Alt Matrix sum
 */
public class Array2D1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] c_Board = new int[n][n];
      
        int sum1 = 0;
        int sum2 = 0;
      
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                c_Board[i][j] = sc.nextInt();
              
               if ((i+j)%2 == 0)
                        sum1 += c_Board[i][j];
             
                    else // count the elements at odd places
                        sum2 += c_Board[i][j];
                 
            }
        }

        System.out.println(sum1+"\n"+sum2);

        sc.close();
    }
}