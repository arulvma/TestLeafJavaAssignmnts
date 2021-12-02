package week1.day2asgnmnt;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		
		char charOcur = 'w';
		int count = 0;
		
		int strLen = str.length();
				
		  for(int i = 0; i <= strLen-1; i++) {
		  
			  	if(str.charAt(i) == charOcur) {
			  		count++;
			  	}
		  }
		  
		  if(count == 1) {
			  System.out.println("Character "+charOcur+" is Occurred "+count+" Time in the Sring of "+str);
			  
		  }
		  else if(count > 1) {
			  System.out.println("Character "+charOcur+" is Occurred "+count+" Times in the Sring of "+str);
		  }
	}

}
