package Assignment;
/*
 * BigLight
Gian and Suneo want their heights to be equal so they asked Doraemons help. Doraemon gave a big light to both of them but both big lights have different speeds of magnifying. Let us assume the big light given to Gian can increase the height of a person by v1 m/s and that of Suneos big light is v2 m/s. At the end of each second Doraemon check if their heights are equal or not.

Given the initial height of Gian and Suneo, your task is to check whether the height of Gian and Suneo will become equal at some point or not, assuming they both started at the same time.

Input
The only line of the input contains 4 spaced integers, h1(height of gian), h2(height of suneo), v1(speed of Gians big light), and v2(speed of Suneos big light).

Constraints
1 <= h2 < h1<=10000 1 <= v1 <= 10000 1 <= v2 <=10000

Output
Print true if their height will become equal at some point (as seen by Doraemon) else print false.

Example
Sample input
4 2 2 4

Sample output
true

Explanation
Height of Gian goes as- 4 6 8 10. . height of Suneo goes as:- 2 6 10.. at the end of 1 second their height will become equal.

Sample Input
5 4 1 6

Sample Output
false
*/

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner in = new Scanner(System.in);
        int h1= in.nextInt(), h2= in.nextInt(), v1= in.nextInt(), v2 = in.nextInt();
        System.out.println(EqualOrNot(h1, h2, v1, v2));

        in.close();
    }

    static boolean EqualOrNot(int h1, int h2, int v1,int v2)
    {
        if(v1==v2) return false;
        int x=((h1-h2)/(v2-v1));
        boolean ans=((h1+x*v1)==(h2+x*v2));
        return ans;
    }
}
