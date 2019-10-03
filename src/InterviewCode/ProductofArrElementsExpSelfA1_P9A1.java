package InterviewCode;

import java.util.Arrays;

//   9  :  Product of Array Elements except self
/*  Given an array of n integers  arr[], return an array output such that output array prod[i] is equal to product of all the elements
 * of arr[] , except arr[i]. Solve it without division operator and in O(n).
 */
public class ProductofArrElementsExpSelfA1_P9A1 {

public static int[] productofElmExpSelf(int arr[], int n){

	int[] t1 = new int[n];
	int[] t2 =  new int[n];
	int[] result =  new int[n];
	
	t1[0] = 1;
	t2[n-1] =1;
	
  for(int i = 0 ;  i < n-1; i++){
	  t1[i+1] = arr[i] * t1[i];
  }
  
  for(int i = n-1 ; i > 0 ; i --){
	  
	  t2[i-1] = arr[i] * t2[i];
	  
  }
  
  for(int i = 0 ; i < n ; i++){
	  result [i] = t1[i] * t2[i];  
  }
  return result;
}

public static void main(String[] args) {
	int[] arr = {1,2,3,4};
	
	int n = arr.length;
	arr = productofElmExpSelf(arr, n);
	
	System.out.println(Arrays.toString(arr));
}
	
}
