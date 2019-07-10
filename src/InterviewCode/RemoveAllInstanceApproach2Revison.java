package InterviewCode;

import java.util.Arrays;
//5
//Given an array and a value , remove all instances of that value in place and return the new length.
public class RemoveAllInstanceApproach2Revison {


private static int[] removeAllInstancesApproach2(int arr[] , int num){
	
	return Arrays.stream(arr).filter(val -> val!=num).toArray();
	
}

public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,66,6,7,8,9,10};
	
	int num = 66;
	
	arr = removeAllInstancesApproach2(arr, num);
	
	System.out.println(Arrays.toString(arr));
	
}
	
}
