package InterviewCode;

// 3
// Remove Duplicates from sorted array without use of extra space (i.e. without using auxiliary/temp array)
public class RemoveDuplicatesSortedArrayNoEx_P3 {

	private static int removeDupliSortedNoex(int arr[] , int n){
		
	  if(n == 0 || n == 1){
		  return n;
	  }
	  
	  int j = 0 ;
	  
	  for(int i = 0 ; i <n-1 ; i ++ ){
		  if(arr[i]!=arr[i+1]){
			  arr[j] = arr[i];
			  j++ ;
		  }
	  }
	  arr[j] = arr[n-1];
	  
	  
	  return j;
	 
	}
	
	public static void main(String[] args) {
		
		int array[]  = {32,32,32,35,35,35,38,38,38,39,39,39};
		
		int k = array.length;
		
		k = removeDupliSortedNoex(array, k);
		
		for(int i = 0 ; i< k+1 ; i ++){
			System.out.println(array[i]);
		}
		
		
		
		
	}
	
}
