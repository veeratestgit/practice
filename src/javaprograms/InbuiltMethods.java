package javaprograms;

public class InbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Simplilearn online ";
		String s2 = "course";
		
//========================using + operator====================================
		
		String s3 =s1+s2;
		
//=====================using concatinate method===============================
		
		String s4 = s1.concat(s2);
		System.out.println("using + operator : " + s3);
		System.out.println("using concat method : " + s4);
		
//=============To check desired character is present or not===================
		
		if(s4.contains("course")) {	
			System.out.println("s1 is valid");
		}
		else {	
			System.out.println("s1 is not valid");
		}
//============Using equal method to check every character is matching==========
		if(s1.equals("Simplilearn online ")) {	
			System.out.println("s1 is valid");
		}
		else {	
			System.out.println("s1 is not valid");
		}
//============Substring=======================================================
		String result = s1.substring(12);
		if(result.equals("online ")){
			System.out.println("s1 is valid");
		}
		else {	
			System.out.println("s1 is not valid");
		}
		
			
			
			
		
	}

}
