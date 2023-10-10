package exceptionPractices;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 9;
		int j = 0;
		/*String name = null;
		System.out.println(name.length());*/
		
		//exception can be handled by using try and catch block
	try {
		System.out.println("result" + i / j);
	}
	catch(ArithmeticException e){
		System.out.println(e);
		//System.out.println("you cannot divide by zero");
		// Different ways to print exception message:
		//e.printStackTrace(); // will print exception, description and message and line number(stacktrace)
		//System.out.println(e.toString()); // will print exception and description, - no stack trace
		//System.out.println(e.getMessage()); // will print only message.
	}
		
		System.out.println("result of multiplication : " + i * j);
		System.out.println("result addidtion : " + i + j);
		System.out.println("result substraction : " + (i - j));

	}

}
