package InterviewCode;

//1
//Print Words of given string in reverse.

public class ReverseStringCode {

	private static String reverseWords(String strng){
		
		int index = strng.length()-1 ;
		
		
		int start  ,  end = index+1;
		String result = "";
		
		while(index>=0){
			
			
			
			if(strng.charAt(index)==' '){
				
				start = index+1;
			
				while(start!=end){
					
					result += strng.charAt(start++);
					
					
								
				}
				result +=" ";
				end = index ; 	
				
			}
			index-- ;
		}
	/*	System.out.println(result);
		return result;*/
		start = 0 ;
while(start!=end){
	 result += strng.charAt(start++);	
		}
		
return result;
		
	}
	
	
	public static void main(String[] args) {
		String inputOne = "I am Ayush Mathur";
		System.out.println(reverseWords(inputOne));
		;
		
	}
}
