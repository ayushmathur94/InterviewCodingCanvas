package InterviewCode;

import java.util.Arrays;

//6
//Given an array, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveAllZeroEndRevision {

private static void Movezeros(int arr[], int n){
	
	int newindex = 0;
	
	for(int i = 0 ; i < n ; i++){
		
		if(arr[i]!=0){
			arr[newindex++] = arr[i];
		}
	}
	
	while(newindex<n){
		arr[newindex++] = 0 ;
	}
	
}

public static void main(String[] args) {
	int arr[] = {1,2,0,3,4,6,5,7,8,0,9};
	
	int n = arr.length;
	
	Movezeros(arr, n);
	
	System.out.println(Arrays.toString(arr));
	
 }
	
}
