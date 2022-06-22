package Assignment;
/*
 * Given a temperature F in Fahrenheit, your task is to convert it into Celsius using the following equation:-

T(°c) = (T(°f) - 32)*5/9

Input

User Task: You have to take an input F and then convert Fahrenheit To Celsius.

Constraints:-

-10^3 <= F <= 10^3

Note:- It is guaranteed that F - 32 will be a multiple of 9.

Output

Return an integer containing converted temperature to Celsius.
 */

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();

        System.out.println((((f-32)*5)/9));

        in.close();
    }
}
