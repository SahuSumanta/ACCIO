package Assignment.Sorting;


import java.util.Scanner;

public class InsertionSort2 {
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

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
                
            }
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println(" ");
        }

    }

    static void swap(int[] arr, int maxIndex, int lastIndex) {
        
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
    }
}
