package Assignment.SwitchCase;


import java.util.Scanner;
/*
Find First and Last Position of Element in Sorted Array
     For Algorithm Reference
 * https://www.enjoyalgorithms.com/blog/first-and-last-positions-of-element-in-sorted-array
 */

public class Switch5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        firstlastindex(arr, n, t);
        
        sc.close();
    }

    //First occurance
    static int first(int[] arr, int n, int t){
        int low = 0, high = n-1;

        while (low <= high) {
            int mid = low+(high - low) / 2;
            if ((mid == 0 || arr[mid-1] < t) && arr[mid] == t) {
                return mid;
            }

            else if (t > arr[mid]) {
                low = mid+1;
            }

            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    static int last(int[] arr, int n, int t){
        int low = 0, high = n-1;

        while (low <= high) {
            int mid = low+(high - low) / 2;
            if ((mid == n-1 || arr[mid+1] >  t) && arr[mid] == t) {
                return mid;
            }

            else if (t < arr[mid]) {
                
                high = mid - 1;
            }

            else{
                low = mid+1;
            }
        }
        return -1;
    }

    static void firstlastindex(int[] arr, int n, int t){
        int firstlast[] = {-1, -1};
        firstlast[0] = first(arr, n, t);
        firstlast[1] = last(arr, n, t);

        for (int index = 0; index < firstlast.length; index++) {
            System.out.print(firstlast[index]+" ");
        }
    }
    
}
