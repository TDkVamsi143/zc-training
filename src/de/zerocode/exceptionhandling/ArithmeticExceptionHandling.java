package de.zerocode.exceptionhandling;

public class ArithmeticExceptionHandling {

	public  String divide(int first, int second ) {
		int exp;
		try {
			// performing division and storing the result
			exp =  first/ second;
			return "Division process has been done successfully"+ exp;
				
			
		}
		// handling the exception in the catch block
		catch (ArithmeticException ex) {
			return "Should avoid dividing by 0 " + ex;
		}

	}

}
