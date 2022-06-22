package Assignment;

import java.util.Scanner;

/**
 * 1
 */
public class A1 {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();

		if((month==2))
            System.out.println(29);

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println(31);

        else
            System.out.println(30);

        in.close();
    }
    
}