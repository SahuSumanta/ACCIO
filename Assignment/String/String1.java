package Assignment.String;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] indices = new int[n];

        for (int i = 0; i < indices.length; i++) {
            indices[i] = sc.nextInt();
        }

        System.out.println(restoreString(str, indices));

        sc.close();
    }

    public static  String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }

        return new String(ans);
    }
}
