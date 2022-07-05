package Assignment.Condition;

import java.util.Scanner;

public class c4 {
    public static void main (String[] args) throws java.lang.Exception
	{
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
