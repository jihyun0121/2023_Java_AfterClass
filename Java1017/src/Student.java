
public class Student {

	String name;
	int stuId;
	int age;
	String phone;

	public Student() {
		
	}
	public Student(String name, int stuId, int age, String phone) {
		this.name = name;
		this.stuId = stuId;
		this.age = age;
		this.phone = phone;
	}

	public void display() {
		System.out.println(name + " " + stuId + " " + age + " " + phone);
	}
}
