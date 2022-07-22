package Assignment.String;

import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {
        // char[] A = {'A','B','C'};
        // char[] B = {'B','A','B','C'};
        // char[] C = {'C','C','A','A','B','B'};

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // char[] ch = sc.next().toCharArray();
        // sc.close();
        // int a = 0, b=0, c = 0, max = Integer.MIN_VALUE; 

        // for (int i = 0; i < n; i++) {
        //     if(A[i%3] == ch[i]){
        //         a++;
        //     }

        //     if(B[i%4] == ch[i]){
        //         b++;
        //     }

        //     if(C[i%5] == ch[i]){
        //         c++;
        //     }
        // }

        // max = Math.max(a, Math.max(b, c));
        // System.out.println(max);

        // if (a == max) {
        //     System.out.println("Adrian");
        // }
        // if (b == max) {
        //     System.out.println("Bruno");
        // }
        // if (c == max) {
        //     System.out.println("Goran");
        // }


        Scanner s = new Scanner(System.in);
      int n = s.nextInt(); 
        String Adrian = "";
        String Bruno = "";
        String Goran = "";
 
        while(Adrian.length()<n) {
          Adrian += "ABC";
        }
         while(Bruno.length()<n) {
          Bruno += "BABC";
        }
 
        while(Goran.length()<n) {
          Goran += "CCAABB";
        }
        String answer = s.next(); 
        int scoreAdrian = 0; 
        int scoreBruno = 0; 
        int scoreGoran = 0;
        for(int i=0;i<n;i++) {
          if(answer.charAt(i)== Adrian.charAt(i)) {
            scoreAdrian++;
          }
          if(answer.charAt(i)== Bruno.charAt(i)) {
            scoreBruno++;
          }
          if(answer.charAt(i)== Goran.charAt(i)) {
            scoreGoran++;
          }
        }
 s.close();
 String result = "";
 int res;
      
          if(scoreAdrian>=scoreBruno && scoreAdrian>=scoreGoran) {
            res = scoreAdrian;
            result = "Adrian";
          }
          else if (scoreBruno>=scoreAdrian && scoreBruno>=scoreGoran) {
                res = scoreBruno;
            result = "Bruno";
          }
          else  {
            res = scoreGoran;
            result = "Goran";
          }
        System.out.println(res);
      if(res == scoreAdrian) {
        System.out.println("Adrian");
        }
      if(res == scoreBruno) {
        System.out.println("Bruno");
        }
      if(res == scoreGoran) {
        System.out.println("Goran");
        }

    }
}
