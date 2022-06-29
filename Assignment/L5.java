package Assignment;

import java.util.Scanner;

/*Reverse digits of a Number
Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
 */
public class L5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rev = 0;

        while (num != 0) {
            int rem = num%10;
            rev = rev * 10+ rem;
            num /= 10;
        }

        System.out.println(rev);
        in.close();
    }
}
