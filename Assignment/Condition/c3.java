package Assignment.Condition;

import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int c = in.nextInt();
      int b = in.nextInt();
      
      if(a*a>b*b+c*c || b*b>c*c+a*a || c*c>a*a+b*b){
        System.out.println("3");
      }
      
      else if(a*a<b*b+c*c && b*b<c*c+a*a && c*c<a*a+b*b){
        System.out.println("1");
      }
      
      else{
        System.out.println("2");
      }
    }
}
