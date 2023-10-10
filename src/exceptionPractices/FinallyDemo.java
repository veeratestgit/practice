package exceptionPractices;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//any code in finally block will defintialy work irespective of handling error
		int i = 9;
		int j = 0;
		try{
			System.out.println("result" + i / j);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
		System.out.println("result of multiplication : " + i * j);
		System.out.println("result addidtion : " + i + j);
		System.out.println("result substraction : " + (i - j));
		}

	}

}
