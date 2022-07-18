package Assignment.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

    
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * int[] arr = new int[n];
     * for (int index = 0; index < n; index++) {
     * arr[index] = sc.nextInt();
     * }
     * 
     * System.out.println(largestNumber(arr));
     * sc.close();
     * }
     * 
     * public static String largestNumber(int[]nums) {
     * int n = nums.length;
     * String[] arr = new String[n];
     * for (int i = 0; i < n; i++) {
     * //converted to string array
     * arr[i] = nums[i] + "";
     * }
     * 
     * Arrays.sort(arr,(a,b)->{
     * 
     * long n1 = Long.parseLong(a+b);
     * long n2 = Long.parseLong(b+a);
     * 
     * if(n1 > n2){
     * return 1;
     * }
     * else if(n1 < n2){
     * return -1;
     * }
     * else{
     * return 0;
     * }
     * });
     * 
     * StringBuilder sb = new StringBuilder("");
     * 
     * for (int i = n-1; i >= 0; i--) {
     * sb.append(arr[i]);
     * }
     * if(sb.charAt(0) == '0') return "0";
     * return sb.toString();
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int index = 0; index < n; index++) {
            arr[index] = sc.next();
        }
        System.out.println(largestNumber(arr));
        sc.close();
    }

    public static String largestNumber(String[] arr) {

        int n = arr.length;
        Arrays.sort(arr, (a, b) -> {
            long n1 = Long.parseLong(a + b);
            long n2 = Long.parseLong(b + a);
            if (n1 > n2) {
                return 1;
            } else if (n1 < n2) {
                return -1;
            } else {
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder("");
        for (int i = n - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        if (sb.charAt(0) == '0')
            return "0";
        return sb.toString();
    }
}
