package Assignment.Sorting;

import java.util.Scanner;

public class QuickSort1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        int[] result = new int[N];
        int p = sc.nextInt();
        int pcount = 1, j = 0;
        for (int i = 1; i < N; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] < p)
                result[j++] = ar[i];
            else if (ar[i] == p)
                pcount++;   
        }
        for (int i = 0; i < pcount; i++)
            result[j++] = p;
        
        for (int i = 1; i < N; i++) {
            if (ar[i] > p)
                result[j++] = ar[i];
        }
        
        for (int i : result)
            System.out.print(i + " ");


            sc.close();
    }
}
