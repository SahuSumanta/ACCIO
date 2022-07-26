package Assignment.Recursion;

import java.util.Scanner;

public class Nox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(remove(str));

        sc.close();
    }

    private static String remove(String str) {
        
        if(str.length() == 0) return str;

        if (str.charAt(0) == 'x') {
            return remove(str.substring(1, str.length())); //remove function
        }

        return str.charAt(0)+remove(str.substring(1, str.length()));
    }
}
