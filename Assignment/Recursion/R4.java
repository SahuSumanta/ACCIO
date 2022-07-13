package Assignment.Recursion;

import java.util.Scanner;

public class R4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        System.out.println(array11(arr, index));

        sc.close();

    }

    public static int array11(int[] nums, int index) {

        if (index >= nums.length) {
            return 0;
        }

        if (nums[index] == 11) {

            return 1 + array11(nums, index + 1);
        }

        return array11(nums, index + 1);
    }
}
