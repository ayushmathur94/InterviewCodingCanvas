package InterviewCode;

import java.util.Arrays;

// 4
// Remove Duplicates from input unsorted Array
public class RemoveDuplicatesUnsortedArray_P4 {

	private static int removeDupliFromUnsortedArray(int arr[], int n){
		
		if(n == 0 || n == 1){
			return n ;
		}
		
		
		int j = 0;
		
		for(int i = 0 ; i < n-1 ; i++)
		{
			if(arr[i]!=arr[i+1]){
				
				arr[j++] = arr[i];
			}
		}
		
		arr[j++] = arr[n-1];
		
		return j;
		
	}
	
	
	public static void main(String[] args) {
		int arrayOK[] = {55,55,1,1,45,45,41,66,43,43,63,63,21,2,2,21,21};
		
		int k = arrayOK.length;
		Arrays.sort(arrayOK);
		k = removeDupliFromUnsortedArray(arrayOK, k);
		
		
		
		for(int i = 0 ; i<k ; i++){
			System.out.println(arrayOK[i]);
		}
		
		
		
				
	}
	
	
}
