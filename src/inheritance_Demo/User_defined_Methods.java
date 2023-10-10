package inheritance_Demo;

public class User_defined_Methods {
//=================Methods  not returning any values or void ===============================	
	public void login(){
		System.out.println("Enter Username");
		System.out.println("Enter Paswword");
		System.out.println("Login to mailbox");
	}
	public void compose(){
		System.out.println("Compose an email");
	}
	public void logout(){
		System.out.println("Click on logout botton");
	}

	public static void main(String[] args) {
//=========Create object for class that is used to call a method=======================		
		User_defined_Methods obj = new User_defined_Methods();
		obj.login();
		obj.compose();
		obj.logout();
		// TODO Auto-generated method stub

	}

}
