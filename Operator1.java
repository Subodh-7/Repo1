package Studentdetails;

public class Operator1 {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(++a); //11
		System.out.println(a); //11
		int b = 110;
		int c = a + b; //binary works with two operands
		
		//ternary operator or conditional operator
		int marks = 40;
		/*String result;
		if(marks >= 40)
			result = "pass";
		else
			result = "fail";
		
		System.out.println(result);
		*/
		String result1 = marks >= 40 ? "pass" : "fail";
		System.out.println(result1);
		
		int r = 100;
		int p = 200;
		int e = (r < p) ? r++ : r*2;
		System.out.println(e);
		
		
	}

}
