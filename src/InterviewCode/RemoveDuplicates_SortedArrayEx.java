package InterviewCode;

// 2
// Remove Duplicates from sorted Array (Can use extra Space) i.e. auxiliary array.
public class RemoveDuplicates_SortedArrayEx {

	private static int RemoveDuplicates(int arr[] , int n){
		
		if(n==0 || n == 1){
			return n;
		}
		
		int[] temp =  new int[n];
		
		int j = 0 ;
		
		for(int i = 0 ; i < n-1; i++){
			
			if(arr[i]!=arr[i+1]){
				temp[j++] =  arr[i];
			}
			
		}
		
		temp[j++] = arr[n-1];
		
		
		System.out.println("After 1st for loop, j is : " + j);
		
		for(int i= 0 ; i < j ; i++){
			arr[i] = temp[i];
		}
	
		System.out.println("After 2nd for loop, j is : " + j);
		
		return j;
	}
	
	
	public static void main(String[] args) {
		int inputarr[] = {1, 2, 2, 3, 4,4,4,4,5,6,6,7,7,7,7,7,8,9,10};
		
		int n = inputarr.length;
		
		n = RemoveDuplicates(inputarr, n);
		
		
		System.out.println("Returned value of n is " + n);
		
		for(int i = 0 ; i < n ; i++){
			
			System.out.println(inputarr[i]);
			
		}
		
		
	}

	
}
