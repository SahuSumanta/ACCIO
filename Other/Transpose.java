package Other;

import java.util.Scanner;

public class Transpose {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
    int cols = sc.nextInt();  
          
        int[][] arr = new int[rows][cols];

    for(int i = 0;i < rows; i++){
      for(int j = 0; j < cols; j++){
        arr[i][j] = sc.nextInt();
      }
    }
          //Calculates number of rows and columns present in given matrix  
          rows = arr.length;  
        cols = arr[0].length;  
          
        //Declare array t with reverse dimensions  
        int t[][] = new int[cols][rows];  
          
        //Calculates transpose of given matrix  
        for(int i = 0; i < cols; i++){  
            for(int j = 0; j < rows; j++){  
                //Converts the row of original matrix into column of transposed matrix  
                t[i][j] = arr[j][i];  
            }  
        }  
          
        
        for(int i = 0; i < cols; i++){  
            for(int j = 0; j < rows; j++){  
               System.out.print(t[i][j] + " ");  
            }  
            System.out.println();  
        }  

        sc.close();
    }  
}
