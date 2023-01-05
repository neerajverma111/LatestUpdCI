package neeraj;
//this is the program for exception handling

//try block = exception nu detect krn lyi
//catch block = exception nu handle krn lyi

public class ExceptionHandling {
	public static void main(String args[]) {
		try {
			int divideByZero = 5/5;
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled =>"+ e.getMessage());
			
		}//finally block always executes ,we will write that code in finally block that we want to run in every case.
		finally {
			System.out.println("always executed");
		}
		System.out.println("Rest of code");
	}

}
