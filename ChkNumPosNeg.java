package week1.day2asgnmnt;

public class ChkNumPosNeg {

	 public int NumPosorNeg(int num) {
		  
		  if (num > 0 ) {		  
			  System.out.println("The given number is "+num+ " and which is a positive number"); }
		  else if(num < 0 ){
			  System.out.println("The given number is "+num+ " and which is a negative number");}
		  else {
			  System.out.println("The given number is "+num+ " and which is neither positive nor negative number");
		  }
		
		  return num;
		  
		  }
	 
	public static void main(String[] args) {
		
		ChkNumPosNeg Obj = new ChkNumPosNeg();
		Obj.NumPosorNeg(5);

	}

}
