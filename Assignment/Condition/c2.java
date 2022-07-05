package Assignment.Condition;

import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();

        System.out.println((((f-32)*5)/9));

        in.close();
    }
}
