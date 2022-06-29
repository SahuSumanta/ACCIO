package Assignment;

import java.util.Scanner;

/**
 * L4
 */
public class L4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pow = 1;
        for (int index = 1; index <= b; index++) {
            pow *= a;
        }

        System.out.println(pow);
        sc.close();
    }
}