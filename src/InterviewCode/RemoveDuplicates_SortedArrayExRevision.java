package InterviewCode;


//2
//Remove Duplicates from sorted Array (Can use extra Space) i.e. auxiliary array.
public class RemoveDuplicates_SortedArrayExRevision {

	
	private static int RemoveDuplicatesSortedArr(int arr[] , int n){
		
		if(n==0 || n == 1){
			return n;
		}
		
		int[] temp  = new int[n];
		
		int j = 0 ;
		
		for(int i = 0 ; i < n -1 ; i ++){
			if(arr[i]!=arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}
		
		temp[j++] = arr[n-1];
		
		for(int i = 0 ; i <  j ; i++){
			arr[i] = temp[i];
		}
		
		return j;
	}
	
	public static void main(String[] args) {
		int[] array  = {1,1,1,1,3,3,3,3,5,5,5,5,7,7,7,7,8,8,8,8,8,8,9,9,9,10};
		
		int n = array.length;
		
		n =  RemoveDuplicatesSortedArr(array, n);
		
		for(int i = 0 ; i < n ; i ++ ){
		System.out.println(array[i]);
		}
	}
	
	
	
	
	
	
}
