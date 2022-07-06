package Assignment.SwitchCase;

import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(lastIndex(S));
    }

    public static int lastIndex( String s) {
        
        char[] ch = s.toCharArray();
        
        for(int i=ch.length-1;i>=0;i--)
      {
          if(ch[i]=='1')
          return i;
      }return -1;
    }
}
