package InterviewCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//5
//Given an array and a value , remove all instances of that value in place and return the new length.
public class RemoveAllInstanceApproach3Revision {

	private static int[] removeElement(int[] arr , int numb){
		
		List<Integer> numlist = new ArrayList<Integer>();
		
		for(int inputnum : arr){
			
			if(inputnum != numb){
				numlist.add(inputnum);
			}
		}
		
		return numlist.stream().mapToInt(Integer::intValue).toArray();		
	}

	public static void main(String[] args) {
		int arr[]  = {22, 20,33,44,55,20,66,77,20,88,99};
		
		int numb = 20;
		
		arr = removeElement(arr, numb);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
