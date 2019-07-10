package InterviewCode;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

//5
//Given an array and a value , remove all instances of that value in place and return the new length.

public class RemoveAllInstanceApproach2 {			

	private static int[] removeAllInstanceUsingStream(int arr[], int num){
		
		return Arrays.stream(arr).filter(val -> val!=num).toArray();
		
		
	}
	
	public static void main(String[] args) {
	 	
	int array[] = {20,30,40,55,50,60,70,55,80,90,55};
	
   int num = 55;
   
   Arrays.sort(array);
   
   array = removeAllInstanceUsingStream(array, num);
	
   for(int i = 0 ; i < array.length ; i ++){
	   System.out.println(array[i]);
	  
   }
	
	
		
	
		
	}
 	
	
}
