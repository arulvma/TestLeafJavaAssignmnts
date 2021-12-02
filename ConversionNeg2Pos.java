package week1.day2asgnmnt;

public class ConversionNeg2Pos {

	public int convrt2Pos(int num) {
		int convrtd2Pos;
		
		if (num > 0 ) {		  
			  System.out.println("The given number is "+num+ " and which is positive number"); }
		 else if(num < 0 ){
			 convrtd2Pos = num * (-1); 
			 //System.out.println(convrtd2Pos);
			 System.out.println("The given number is "+num+ " and is negative number "+ "and its Converted Positive Number is  "+convrtd2Pos);
			 }
		return num;		
		
		} 
	 
	public static void main(String[] args) {
		ConversionNeg2Pos obj = new ConversionNeg2Pos();
		
		obj.convrt2Pos(-55);
		
		

	}

}
