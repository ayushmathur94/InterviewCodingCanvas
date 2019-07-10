package InterviewCode;

import java.util.Arrays;
//10
//Remove duplicates from an array if duplicates are allowed at most twice.
public class RemovDupliIFAllowedRevision {

	private static int removeDupIfAllowedTwice(int arr[], int n){
		
		if(arr == null){
			return 0 ;
		}
		
		if(n<=2){
			return n;
		}
		
	 int i = 1;
	 int j = 2;
	 
	 while(j<n){
		 
		 if(arr[j] == arr[i] && arr[j] == arr[i-1]){
			 j ++ ;
		 }
		 else{
			 i ++;
			 
			 arr[i] = arr[j];
			 
			j++;
		 }
	 }
	 return i+1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,4,4,4,5,5,5,5,52,2,2,2,2,2,6,6,6,6,6,7,7,7};
		
		int n = arr.length ;
		 
		Arrays.sort(arr);
		
		n = removeDupIfAllowedTwice(arr, n);
		for(int i = 0 ; i< n ; i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	
}
