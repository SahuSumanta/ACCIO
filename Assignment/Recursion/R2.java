package Assignment.Recursion;

import java.util.Scanner;
/*Recursive Fibonacci */
public class R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
        sc.close();
    }

    static int fibo(int n){
        // if(n <= 0) return 0;
        if(n == 1) return 0;
        if(n == 2 ||n == 3) return 1;

        return fibo(n-1)+fibo(n-2);
    }
}
