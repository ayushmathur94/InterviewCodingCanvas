package InterviewCode;

//3
//Remove Duplicates from sorted array without use of extra space (i.e. without using auxiliary/temp array)

public class RemoveDuplisSortedArrayNoExRevision {

	private static int removeDuplicatesNoEx(int arr[] , int n){
		
		if(n==0 || n ==1){
			return n;
		}
		
		
		int j = 0 ;
		
		for(int i = 0 ; i< n-1 ; i++){
			if(arr[i]!= arr[i+1]){
				arr[j++] = arr[i];
			}
		}
	
		arr[j++] = arr[n-1];
		
	return j;		
	}
	
public static void main(String[] args) {
	
	int[] array = {1,1,1,1,3,3,3,5,5,5,55,55,100,100,101,111,111,221};
	
	int n = array.length;
	
	n = removeDuplicatesNoEx(array, n);
	
	for(int i = 0 ; i < n ; i ++){
		System.out.println(array[i]);
	}
}
	
}
