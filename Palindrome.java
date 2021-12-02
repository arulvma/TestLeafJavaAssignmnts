package week1.day2asgnmnt;

public class Palindrome {

	public String whtherPali(String pali) {
		
		String rev = "";
		
		int strPalLen = pali.length();
		
		for(int i = strPalLen - 1; i >= 0; i--) {
			
			rev = rev + pali.charAt(i);
			
		}		
		
		boolean whtherPali = pali.equals(rev);
		
		if(whtherPali == true) {
			System.out.println("Input String is "+pali+" and is a Palindrome");
		}
		else if(whtherPali == false){			
			System.out.println("Input String is "+pali+" and is not a Palindrome");
		}	
		return pali; 
	} 
	
	public static void main(String[] args) {
		
		Palindrome palObj = new Palindrome();
		palObj.whtherPali("all");	 

	}

}
