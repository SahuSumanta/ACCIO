package Assignment.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Array9
 */
public class Array9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        long ans = 0;
        
        for (int i = 0; i < arr.length; i++) {
            ans += ((long)arr[n-i-1])<<i; 
            /*
             * 9 << 3; // 72
             * 9 * (2 ** 3) = 9 * (8) = 72
             */
        }
        System.out.println(ans);
    }
}