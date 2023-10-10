package exceptionPractices;

public class ThrowsKeywordDemo {
	
	public void div(int a , int b) throws ArithmeticException
	{
		if (b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c = a/b;
			System.out.println(c);
			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsKeywordDemo obj = new ThrowsKeywordDemo();
		try{
			obj.div(12, 0);	
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Do not give b value as 0");
		}
		
		
		System.out.println(" further Execute the code1");

	}

}
