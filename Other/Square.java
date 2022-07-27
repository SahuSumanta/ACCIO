package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int x1 = Integer.parseInt(S[0]);
            int y1 = Integer.parseInt(S[1]);
            int x2 = Integer.parseInt(S[2]);
            int y2 = Integer.parseInt(S[3]);
            int x3 = Integer.parseInt(S[4]);
            int y3 = Integer.parseInt(S[5]);
            int x4 = Integer.parseInt(S[6]);
            int y4 = Integer.parseInt(S[7]);

           System.out.println(isSquare(x1, y1, x2, y2, x3, y3, x4, y4));
        }
    }

    static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
       if (x1==x2 && x3 == x4 && y1==y2 && y3 == y4) {
         return "No";
       }

       if (Math.abs(x1-x2) == Math.abs(x3-x4) && Math.abs(y1-y2) == Math.abs(y3-y4)) {
            return "Yes";
       }

       return "No";
    }
}
