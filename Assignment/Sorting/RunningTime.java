package Assignment.Sorting;

import java.util.Scanner;

public class RunningTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        instertion(arr);

        sc.close();

    }

    static void instertion(int[] arr) {
        int swap_count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swap_count++;
                } else {
                    break;
                }
                
            }
        }

        System.out.println(swap_count);

    }

    static void swap(int[] arr, int maxIndex, int lastIndex) {
        
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
    }
}
