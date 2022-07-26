package Assignment.Recursion;

import java.util.Scanner;

public class Pairstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(pair(s));

        sc.close();
        
    }

    static String pair(String str){
        if (str.length() == 1 || str.equals("")) {
            return str;
        }

        if(str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + pair(str.substring(1, str.length()));
        }

        return str.charAt(0) + pair(str.substring(1, str.length()));
    }
}
