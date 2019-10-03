package InterviewCode;

import java.util.Arrays;

// 5
// Given an array and a value , remove all instances of that value in place and return the new length.
public class RemoveAllInstancesofaNum_P5A1 {

	private static int[] removeAllInstancsofNum(int arr[] , int num){
		
		int j = 0 ;
		
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i]!= num){
				arr[j++] = arr[i];
			}
		}

	return Arrays.copyOf(arr, j);
	
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,300,3,4,5,6,7,8,9};
		
		int num = 300;
		Arrays.sort(arr);
		
		arr = removeAllInstancsofNum(arr, num);
		
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
	}
	
 
	
}
