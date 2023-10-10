package javaprograms;

public class Student {
	int rollno;
	String name;
	static String college = "MGT";
	static void change(){
		college = "MGIT";
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display(){
		System.out.println(rollno + " " + name +  " " + college);
	}

	public static void main(String[] args) {
		Student.change();
		Student s1 = new Student(111,"paul");
		Student s2 = new Student(112,"mary");
		s1.display();
		Student.college = "VJIT";
		s2.display();
		s1.display();
		// TODO Auto-generated method stub

	}

}
