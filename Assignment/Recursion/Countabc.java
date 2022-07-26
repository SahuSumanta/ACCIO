package Assignment.Recursion;

import java.util.Scanner;

public class Countabc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(count(str));

        sc.close();

    }

    static int count(String s) {
        if (s.length() < 3) {

            return 0;
        }

        if (s.substring(0, 3).equals("abc") || s.substring(0, 3).equals("aba")) {
            return 1 + count(s.substring(1, s.length()));
        }

        return count(s.substring(1, s.length()));
    }

}
