package inheritance_Demo;

public class HomePage extends Base {
	//child class
	public void Homepagetest(){
		System.out.println("Test for home page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage obj = new HomePage();
		obj.openbrowser("chrome");
		login("admin "," admin");
		obj.Homepagetest();
		obj.logout();
		

	}

}
