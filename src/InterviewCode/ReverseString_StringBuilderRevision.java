package InterviewCode;

// 1
// Print Words of given string in reverse.

public class ReverseString_StringBuilderRevision {

	private static String ReverseWordsStringBuilder (String strng){
		
		if(strng == null || strng.length() == 0){
			return "";
		}
		
		String[] arr = strng.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = arr.length-1 ; i >=0  ; --i){
		
			if(!arr[i].equals("")){
				
				sb.append(arr[i]).append(" ");
			}
			
		
			
		}
		
		return sb.length() == 0 ? "" : sb.substring(0 , sb.length()-1);
	}
	
	
	public static void main(String[] args) {
		
		String str =  "Do Code Effortlessly";
		
		System.out.println(ReverseWordsStringBuilder(str));
		
	}
	
}
