package InterviewCode;

import java.util.Arrays;
//9  :  Product of Array Elements except self
/*  Given an array of n integers  arr[], return an array output such that output array prod[i] is equal to product of all the elements
* of arr[] , except arr[i]. Solve it without division operator and in O(n).
*/
public class ProductofArrElementsExpSelfA2_P9A2 {

	public static int[] productExSelf(int arr[] , int n){
		
		int result[] =  new int[n];
		
		result[n-1] = 1;
		
		for(int i = n -2; i >= 0 ; i --){
			result[i] = result[i+1] * arr[i+1];
		}
		int left = 1;
		for(int i = 0 ; i<n ; i++){
			result[i] = result[i] * left; 
			left = left*arr[i];
		}	
				
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr  = {1, 2, 3,4};
		
		int n =arr.length;
		
		arr = productExSelf(arr, n);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
