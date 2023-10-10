package javaprograms;

public class Loops {

	public static void main(String[] args) {
	// print numbers from 1 -10 using simple println statement
		System.out.println("1"); System.out.println("2"); System.out.println("3");
		System.out.println("4"); System.out.println("5"); System.out.println("6");
		System.out.println("7"); System.out.println("8"); System.out.println("9");
		System.out.println("10"); 	
	//print numbers from 11 -20 using while loop
		int  i = 11 ;
		while( i <= 20 ){
			System.out.println(i);
			i++ ;	
		}
	//print numbers from 21 -30 using for loop
		int x ;
		for(x=21;x<=30;x++) {
			System.out.println(x);
		}	
	//print numbers from 31 -40 using do while loop
		int n = 31;
		do{
			System.out.println(n);
			n++;
		}while(n<=40);
		System.out.println("Printed values using loops ");
	}
}
