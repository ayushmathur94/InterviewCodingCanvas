package InterviewCode;
import java.util.Arrays;

//5
//Given an array and a value , remove all instances of that value in place and return the new length.

public class RemoveAllInstancesofaNumRevision {

	private static int[] removeAllInstanceOfANum(int arr[], int num){
		
		int newindex = 0 ;
		
		for(int i = 0 ; i < arr.length ; i++){
			
			if(arr[i] != num){
				arr[newindex++] = arr[i];
			}
		}
		
		System.out.println("here new index is : " + newindex);
		
	
		return Arrays.copyOf(arr, newindex);
			}
	
	
	public static void main(String[] args) {
		int arrayZone[] = {13,15,16,77,17,18,19,20,77};
		
		int num = 77;
		
		arrayZone = removeAllInstanceOfANum(arrayZone, num);
		
		for(int i = 0 ; i < arrayZone.length ; i++){
			System.out.println(arrayZone[i]);
		}
		
	}
}
