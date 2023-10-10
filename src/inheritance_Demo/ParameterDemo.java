package inheritance_Demo;

public class ParameterDemo {
	public void login(String username , String password){
		System.out.println("Enter  Username : " + username);
		System.out.println("Enter Paswword : "  + password);
		System.out.println("Login to mailbox");
	}
	public void compose(String text){
		System.out.println("Compose an email : " +text);
	}
	public void logout(){
		System.out.println("Click on logout botton");
	}

	public static void main(String[] args) {
//=========Create object for class that is used to call a method=======================		
		ParameterDemo obj = new ParameterDemo();
		obj.login("sonal","admin@123");
		obj.compose("hello all");
		obj.logout();
		obj.login("sonal","admin@123");

	}

}
