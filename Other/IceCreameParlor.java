package Other;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreameParlor {
    public static int calc(int[] arr,int n,int x){
        Arrays.sort(arr);
        int count = 0;
        int sum =0;
        int i=0; 
        while(i<n){
            sum+=arr[i];
            if(sum>x){
                break;
            }
            i++;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = calc(arr, n, x);
        System.out.println(ans);

        sc.close();
    }
}
