package InterviewCode;

import java.util.Arrays;

//10
// Remove duplicates from an array if duplicates are allowed at most twice.

public class RemovDupliIFAllowed {
	
	private static int removeifAllowed(int arr[] , int n){
		
		if(arr == null){
			return 0;
		}
		
		if(n <=2 ){
			return n;
		}
		
		int i = 1;
		int j = 2;
		
		while(j<n){
			
			if(arr[j] == arr[i] && arr[j] == arr[i-1])
			{
				j++; 
			}
			else{
				i++;
				
				arr[i] =arr[j];
				j++ ;
			}
		}
		return i+1;
	}

	public static void main(String[] args) {
		int arr[] = {2,2,2,2,4,4,4,5,5,5,5,7,6,6,6,7,8,8,7,8,8,10,10,10,10,10,11,11,11,11,11,2222,2222 ,2222};
		int n = arr.length;
		
		Arrays.sort(arr);
		
	   n = removeifAllowed(arr, n);
		
	   for(int i = 0 ; i < n ; i++){
		   System.out.println(arr[i]);
	   }
	   
	}

	
}
