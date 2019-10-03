package InterviewCode;

import java.util.Arrays;

// 6
//Given an array, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

public class MoveAllZeroEnd_P6 {

	private static void moveAllZero(int arr[], int n){
		
		int newindex = 0;
		
		for(int i = 0 ; i < n ; i++){
			
			if(arr[i]!=0){
				arr[newindex++] = arr[i];
			}
		}
		
		while(newindex < n){
			arr[newindex++] = 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {0,11,12,0,13,0,14,0,15,0,16,20};
	
		int n =  arr.length;
		
		moveAllZero(arr, n);
		

		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	
}
