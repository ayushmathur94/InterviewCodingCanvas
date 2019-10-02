package InterviewCode;

// 1
//Print Words of given string in reverse.

public class ReverseString_StringBuilder {

	private static String reverseWordsStringBuilder(String strng){
		
		if(strng.length() == 0 || strng == null){
			return strng = "";
		}
		String result = "";
		
		String[] arr = strng.split(" ");
		
		/*for(int i = 0 ; i < arr.length; i++){
		System.out.println(arr[i]);
		}*/
		
		StringBuilder sb = new StringBuilder();
		
	//	for(int i = arr.length-1 ; i>=0 ; --i){
	  // for(int i = 0 ; i <=arr.length-1 ; i++) {
		 for(int i = arr.length-1;  i >= 0; --i) {
		 
			 if(!arr[i].equals("")){
		   
			sb.append(arr[i]).append(" ");
			
			 }		}
		return sb.length()==0 ? "" : sb.substring(0 , sb.length()-1); 
		

		
	}
	
	public static void main(String[] args) {
		String sample = "Experienced Self Destruction Myself";
	 System.out.println( reverseWordsStringBuilder(sample));
	}
	
}
