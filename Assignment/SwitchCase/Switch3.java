package Assignment.SwitchCase;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int D = in.nextInt();

        int count = 0;
        while (N != 0) {
           int last = N % 10;
           if (last == D) {
            count++;
           }
           N /= 10;
        }
        System.out.println(count);

        in.close();
    }
}
