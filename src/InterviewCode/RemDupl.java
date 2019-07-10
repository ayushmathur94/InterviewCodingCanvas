package InterviewCode;

import java.util.Arrays;

public class RemDupl {

/*	private static int removeTheDupls(int arr[] , int n ){
		
		if(n == 0 || n == 1){
			return n ;
		}
		
		
		int[] temp = new int[n];
		
		int j = 0 ;
		
		for(int i = 0 ; i < n-1 ; i++){
			
			if(arr[i]!=arr[i+1]){
				temp[j++] = arr[i];
			}
		}
		
		temp[j++] = arr[n-1];
		
		for(int i = 0 ; i < j ; i++){
		    arr[i] = temp[i];
		}
		
		return j;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,3,3,3,5,5,5,8,8,8,44,44,44,50,50};
		
		int n = arr.length;
		
		n =removeTheDupls(arr, n);
		 
		for(int i=0; i<n; i++){
			System.out.println(arr[i]);
		}
		
	}*/
	
	
	
	/*private static int[] removeAllInstances(int arr[] , int numb){
		
		
	   int newindex = 0 ;
	   
	   for(int i =0 ; i < arr.length ;  i++){
		   
		   if(arr[i] != numb){
			   arr[newindex++] = arr[i];
		   }
	   }
	     return  Arrays.copyOf(arr, newindex);
	
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70,99,80,99,90};
		int numb = 99;
		
		arr = removeAllInstances(arr, numb);
		
		System.out.println(Arrays.toString(arr));
		
	}*/
	
	
	/*private static int[] removeAllInstancesApproach2(int arr[], int numb){
		
		return Arrays.stream(arr).filter(val -> val!= numb).toArray();
		
	}
	public static void main(String[] args) {
	int[] arr = {10,20,30,40,50,60,70,99,80,99,90};
	int numb = 99;
	
	arr = removeAllInstancesApproach2(arr, numb);
	
	System.out.println(Arrays.toString(arr));
	
}*/
	
	
/*	private static void movezeroatEnd(int arr[] , int n){


		int index = 0;

		for(int i=0 ; i < n ; i ++ ){

		if(arr[i] != 0){
		arr[index++] = arr[i]; 
		}

		}

		while(index < n ){
		arr[index++] = 0;
		}

		}
	
	public static void main(String[] args) {
		
		int arr[] = {0,2,3,4,5,0,6,7,0,8};
		
		int n =  arr.length;
		
		movezeroatEnd(arr, n);
		
		System.out.println(Arrays.toString(arr));
	
		
	}*/
	
	
	private static int[] productwithoutme(int arr[], int n){
		
		
		int[] t1 = new int[n];
		int[] t2 = new int[n];
		int[] result =  new int[n];
		
		t1[0] = 1;
		t2[n-1] =1;
		
		for(int i = 0 ; i < n-1; i ++){
			t1[i+1] = arr[i] * t1[i];
		}
		
		for(int i = n-1 ; i > 0 ; i--){
			t2[i-1]  = arr[i] * t2[i];
			
		}
		
		for(int i = 0 ; i < n ; i++){
			result[i] = t1[i] * t2[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int arr[] = {7,8,9,10,11};
		
		int n = arr.length;
		
		arr = productwithoutme(arr, n);
	
	System.out.println(Arrays.toString(arr));
	}
	
	
}
