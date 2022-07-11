package Assignment.Array;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        System.out.println(sort(arr, b));
        sc.close();
    }

   static int sort(int[] arr, int B) {
     
        int n = arr.length;
        int low= 0, high = n-1;
        int ans = n;
        while (low <= high) {
            int mid = (low+high) / 2;
            if(arr[mid] >= B){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
