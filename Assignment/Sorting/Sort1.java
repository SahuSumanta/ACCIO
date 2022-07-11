package Assignment.Sorting;


import java.util.Scanner;

/*Bubble Sort Problem*/

public class Sort1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        bubbleSort(arr, n);

        in.close();
    }

    public static void bubbleSort(int[] a, int n){
        int Swaps = 0;
        for(int i=0; i< n; i++){
            for(int j=0; j < n - 1; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    Swaps++;
                }
                
            }
            if(Swaps==0)
                break;
        }
       System.out.println("Array is sorted in " + Swaps +" swaps.");
       System.out.println("First Element: " + a[0]);
       System.out.println("Last Element: " + a[n-1]); 
    
    }
}
