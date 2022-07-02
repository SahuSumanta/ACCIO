package Assignment.Array;

import java.util.Scanner;

public class Array1 {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(search(arr, n, k));
        in.close();
	}

    public static int search(int arr[], int n, int k) {

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == k)
                return i+1;
        }
        return -1;
    }

}
