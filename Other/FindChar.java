package Other;

import java.util.Scanner;

public class FindChar {

    
    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char ch = sc.next().charAt(0);
        System.out.print(findNthOccur(str, ch, N));

        sc.close();
    }

    private static int findNthOccur(String str, char ch, int n) {
        for (int i = 1; i < str.length() ; i++) {
            
            if(str.charAt(i) == ch){
                return i+1;
            }
        }

        return -1;
    }

    
}
