package Assignment.SwitchCase;

import java.util.Scanner;

/**
 * CalculatenCr
 */
public class Switch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int diff = n-r;

        long factn = 1, factr = 1, factdiff = 1;
        
        for (int i = 1; i <= n; i++) {
            factn *= i;
        }

        for (int i = 1; i <= r; i++) {
            factr *= i;
        }

        for (int i = 1; i <= diff; i++) {
            factdiff *= i;
        }

        System.out.println(factn/(factdiff * factr));

        in.close();
    }
}