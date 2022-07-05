package Assignment.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[n-2]);
        in.close();    
    }
}
