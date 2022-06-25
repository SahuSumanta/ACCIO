package Assignment;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (int index = 1; index <= n; index++) {
            sum += index;
        }
        System.out.println(sum);

        sc.close();
    }
}
