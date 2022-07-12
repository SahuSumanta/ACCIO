package Assignment.Recursion;

import java.util.Scanner;

/*HRECURS - Hello Recursion*/

public class R1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            System.out.println("Case "+i+": "+sum(arr, n));
        }
        
        in.close();
    }

    static int sum(int[] arr, int n){
        if(n == 0) return 0;
        return (sum(arr, n - 1) + arr[n - 1]);
    }

}
