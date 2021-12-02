package week1.day2asgnmnt;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		
		int count = 0;
		
		int strLen = str.length();
				
		  for(int i = 0; i <= strLen-1; i++) {
		  
			  	if(str.charAt(i) == 'n') {
			  		count++;
			  	}
		  }
		 System.out.println(count);

	}

}
