package Assignment.Array;

import java.util.Scanner;
//Average Calculator
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(avrage(arr, n));

        sc.close();
    }

    static int avrage(int[] arr, int n){
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum/n;

    }
}
