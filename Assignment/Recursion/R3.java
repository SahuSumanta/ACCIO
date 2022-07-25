package Assignment.Recursion;
/* Recursive Digit Sum Problem 
 * We define super digit of an integer n using the following rules:
Given an integer, we need to find the super digit of the integer n.
If n has only 1 digit, then its super digit is n.
Otherwise, the super digit of n is equal to the super digit of the sum of the digits of n.

superDigit has the following parameter(s):

string n: a string representation of an integer
long k: the times to concatenate n to make p.

*Here n=148 and k=3 , so p=148148148.

super_digit(p) = super_digit(148148148) 
               = super_digit(1+4+8+1+4+8+1+4+8)
               = super_digit(39)
               = super_digit(3+9)
               = super_digit(12)
               = super_digit(1+2)
               = super_digit(3)
               = 3
*/

import java.util.Scanner;

public class R3 {

  private static int sumDigits(long n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n = n / 10;
    }
    return sum;
  }

  public static void main(String[] args) {
   
    Scanner in = new Scanner(System.in);
    String n = in.next();
    int k = in.nextInt();
    in.close();

    long sum = 0;
    for (int i = 0; i < n.length(); i++) {
      sum += (int) (n.charAt(i) - '0');
    }
    sum *= k;
    while (sum >= 10)
      sum = sumDigits(sum);
    System.out.println(sum);
  }
}
