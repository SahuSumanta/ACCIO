package Assignment.Array;

/**
 * Subarray Sums Divisible by K
 * TC = O(n^3)
 * SC = O(1)
 */
import java.util.*;

public class Array8
{
  static int count = 0;
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int t = in.nextInt();
      int[] arr = new int[n];

      for(int i = 0; i < n; i++){
        arr[i] = in.nextInt();
      }
      in.close();
      
      for(int i = 0; i < n; i++){
        int sum = 0;
        for(int j = i; j < n; j++){
          for(int k = j; k <= j; k++){
            sum += arr[k];
            if(sum%t == 0) count++;
          }
        }
      }
      System.out.println(count);
	}
}