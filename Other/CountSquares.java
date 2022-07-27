package Other;

import java.util.Scanner;

/**
 * CountSquares
 */
public class CountSquares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(countSquares(N));

        sc.close();
    }

    static int countSquares(int N) {
        int count= 0;
        int i = 1;
        while ((i*i) < N) {
            count++;
            i++;
        }

        return count;
    }
}