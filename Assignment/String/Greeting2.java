package Assignment.String;

import java.util.Scanner;

/**
 * Greeting2
 */
public class Greeting2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int eCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                eCount++;
            }
        }

        System.out.print("h");
        for (int i = 0; i < eCount*2; i++) {
            System.out.print("e");
        }
        System.out.print("y");

        sc.close();
    }
}