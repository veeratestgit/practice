package inheritance_Demo;

public class Payments extends HomePage{
	//multilevel inheritance
	public void payments(){
		System.out.println("test payments page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments obj = new Payments();
		obj.openbrowser("chrome");
		login("admin "," admin");
		obj.Homepagetest();
		obj.payments();
		obj.logout();

	}

}
