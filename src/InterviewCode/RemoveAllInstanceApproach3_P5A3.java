package InterviewCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//5
//Given an array and a value , remove all instances of that value in place and return the new length.
public class RemoveAllInstanceApproach3_P5A3 {

	public static int[] removeElement(int arr[], int numb){
		
		List<Integer> list =  new ArrayList<Integer>();
		
		for(int input : arr){
			if(input!=numb){
			list.add(input);
			}
			
		}
		
		return list.stream().mapToInt(Integer::intValue).toArray();
		
	}
	
	public static void main(String[] args) {
	int[] arr = {10,20,30,40,50,60,70,99,80,99,90};
	int numb = 99;
	
	arr = removeElement(arr, numb);
	
	System.out.println(Arrays.toString(arr));
	
}
	
	
}
