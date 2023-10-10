package inheritance_Demo;

public class Base {
	//parent class
	int hours = 4;
	int min = 35;
	public void openbrowser(String browser){
		System.out.println("open the browser"+ browser);
	}
	public static void login(String username , String password){
		System.out.println("Enter  Username : " + username);
		System.out.println("Enter Paswword : "  + password);
		System.out.println("Login to mailbox");
	}
	public void logout(){
		System.out.println("Click on logout botton");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
