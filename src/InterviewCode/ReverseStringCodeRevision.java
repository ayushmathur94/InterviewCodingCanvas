package InterviewCode;

// 1
//Print Words of given string in reverse.

public class ReverseStringCodeRevision {

	private static String reverseWords(String strng){
		int index = strng.length()-1;
		String result = "";
		int start , end = index+1; 
		
		
		while(index>=0){
			if(strng.charAt(index)==' '){
				
				start = index + 1;
				
				while(start!=end){
					result += strng.charAt(start++);
					
				}
				result += " ";
				
				end = index;			
				}
			
			index -- ;
			
		}
		
		
		start = 0;
		while(start!=end){
			result += strng.charAt(start++);
		}
		
		
		
		
		
		//index -- ;
	
	return result;
}
	
	public static void main(String[] args) {
		String Ayush = "I am Ayush. I will become a successful person." ;
		
		System.out.println(reverseWords(Ayush));
				
	}
}