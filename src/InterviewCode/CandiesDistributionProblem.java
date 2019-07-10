package InterviewCode;

import java.util.Arrays;

//7
/* Candies Distribution - Alice is a kindergarten teacher. She wants to give some candies to the children in her class.
 * All children sit in a line and each one of them has a rating score according to his/her performance in the class. 
 * Alice wants to give at least 1 candy to each child. If two children sit next to each other then the one with higher rating
 * must get more candies. Alice wants to minimize the total number of candies she must buy.
*/

public class CandiesDistributionProblem {

	private static long candiesSolve(int arr[] , int n){
		
		long[] candies = new long[n];
		
		long distribution = 1l;
		
		candies[0] =  distribution;
		
		for(int i = 1; i<n ; i++){
			
		distribution = (arr[i] > arr[i-1] ? distribution + 1 : 1l);
		
		candies[i] = distribution;
		}
		
		
		for(int i = n-2 ; i>=0 ; i --){
			
			if(arr[i] > arr[i+1] && candies[i] <= candies[i+1]){
				
				candies[i] = candies[i+1] + 1;
			
			}
		}
		
		return Arrays.stream(candies).sum();
		}
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,7,8,9,10,2};
		
		int n = arr.length;
		
		System.out.println(candiesSolve(arr,n));
	}
	
	
	
	
}
