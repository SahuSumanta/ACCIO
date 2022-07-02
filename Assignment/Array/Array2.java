package Assignment.Array;

import java.util.Scanner;

public class Array2 {
    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(countBuildings(arr, n));
        in.close();
		
	}

    static int countBuildings(int h[], int n) {
        int see=h[0];
        int count=1;
        for(int i=1; i<n; i++){
            if(see<h[i]){
                count++;
                see=h[i];
            }
        }
        return count;
    }
}
