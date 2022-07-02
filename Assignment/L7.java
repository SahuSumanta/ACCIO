package Assignment;

import java.util.Scanner;

/*Largest Number At Least Twice of Others
 * You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, print the index of the largest element, or print -1 otherwise.

Input:
The first line of the input contains the number 𝑛(length of array) The next n integers denotes the elements of the array.

Output:
print the index of the element if it satisfies the condition else print -1

Constraints:
1 <= nums.length <= 50
0 <= nums[i] <= 100
The largest element in nums is unique.
Sample Input 1
4 3 6 1 0

Sample Output 1
1

Explanation
6 is the largest integer. For every other number in the array x, 6 is at least twice as big as x. The index of value 6 is 1, so we return 1.

Sample Input 2
4
1 2 3 4
Sample Output 2
-1
Explanation
4 is less than twice the value of 3, so we return -1.
 */
public class L7 {
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println(dominantIndex(arr));
      sc.close();
    }
  
  public static int dominantIndex(int[] nums) {
        boolean flag=false;
        int max=0; // assume first index has the max value
        if(nums.length==1) return 0; // if the array contains a single element
		
        for(int i=0;i<nums.length;i++){  //This loop will find the largest number in the array and we will  
            if(nums[max]<nums[i]){         // store the  index of the  largets number in max.
                max= i;
            }
        }
        // Now we will go from 0 to n-1 checking the below condition
        for(int j=0;j<nums.length;j++){
            if(nums[j]*2 <=nums[max] && nums[j]!=nums[max]){
                flag=true;
            }else if(nums[j]*2 >=nums[max] && nums[j]!=nums[max]){
                flag=false;
                break;
            }
        }
        
        if(flag) return max;
        return -1;
    }
}
