package Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * InnerLeaders
 */
public class Leaders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(leaders(arr, n));

        sc.close();
        
    }
    
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        for (int i = n-1; i >= 0; i--) {
            if(arr[i] >= max){
                ans.add(arr[i]);
                max = arr[i];
            }

        }
        Collections.reverse(ans);
        return ans;
    }
}