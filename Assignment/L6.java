package Assignment;

import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
     	int n2 = sc.nextInt();
    	int temp;
   	while (n2 > 0)
   	{
   	     temp = n2;
   	     n2 = n1% n2; 
   	     n1 = temp;
   	}
	System.out.println(n1);

    sc.close();
    }
}
