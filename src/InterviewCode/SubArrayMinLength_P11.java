package InterviewCode;

import java.util.Arrays;

//11
/*Given an array of n positive integers and a positive integer s , find the minimal length of a subarray of which the
*sum >= s . If there isn't one , return 0 instead.
*
*/

public class SubArrayMinLength_P11 {

	public static int minSubArrayLen(int s, int[] arr){
		if(arr == null || arr.length == 0){
			return 0 ;
		}
		
		int i = 0 ;
		int j = 0;
		int sum = 0;
		
		int minLen = Integer.MAX_VALUE; 
		
		while(j < arr.length){
			if(sum<s){
				sum += arr[j];
				j++ ;
			}else{
				minLen = Math.min(minLen, j-i);

				if(i == j-1){
					return 1;
				}
				sum -= arr[i];	
				i++;
			}
		}
			
			while(sum >= s){
				minLen  = 	Math.min(minLen, j-i);
				sum -=arr[i++];
			}
			return minLen == Integer.MAX_VALUE ?  0 : minLen;

	}
	
 public static void main(String[] args) {
		int array[] = {2,3,1,2,4,3};
		
		   int num =7;
		   
		   Arrays.sort(array);
		   System.out.println(minSubArrayLen(num, array));
	
}
	
	
}
