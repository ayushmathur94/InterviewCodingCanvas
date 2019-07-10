package InterviewCode;

import java.util.Arrays;

//4
//Remove Duplicates from input unsorted Array

public class RemoveDuplicatesUnsortedArrayRevision {

	private static int removeDupliUnsortedArray(int arr[], int n){
		
		if(n == 0 || n == 1){
			return n;
		}
		
		int j = 0;
		
		for(int i =0 ; i<n-1; i++){
			if(arr[i]!=arr[i+1]){
				arr[j++] = arr[i];
			}
		}
		
		arr[j++] = arr[n-1];
		return j;
		
	}
	
	public static void main(String[] args) {
		int arrayForceOne[] =  {101,91,91,81,81,92,32,33,33,32,32,32,72,2,72,7,72,7,2,2,2};
		
		int k = arrayForceOne.length;
		
		Arrays.sort(arrayForceOne);
		
		k = removeDupliUnsortedArray(arrayForceOne, k);
		
		for(int i = 0 ; i < k ; i++){
			System.out.println(arrayForceOne[i]);
		}
		
		
	}
	
	
}
