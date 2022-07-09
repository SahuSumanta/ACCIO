package Assignment;

import java.util.Scanner;

public class L8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        

        System.out.println(peakElement(arr, n));
        sc.close();

    }

    public static int peakElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (i != 0 && i != n - 1) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                    return i;
            }
            if (i == 0) {
                if (arr[i] > arr[i + 1])
                    return i;
            }
            if (i == n - 1) {
                if (arr[i] > arr[i - 1])
                    return i;
            }
        }
        return -1;
    }
}
