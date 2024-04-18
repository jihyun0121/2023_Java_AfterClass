
public class Menu {
	String name;
	int stuId;
	int age;
	String phone;
	
	public Menu() {	}
	public Menu(String name, int stuId, int age, String phone) {
		this.name = name;
		this.stuId = stuId;
		this.age = age;
		this.phone = phone;
	}

	public String print() {
		return "[이름 : " + name + ", 학번 : " + stuId + ", 나이 : " + age + ", 전화번호 : " + phone + "]";
	}
	
	public void show() {
		System.out.println("학생 [이름 : " + name + ", 학번 : " + stuId + ", 나이 : " + age + ", 전화번호 : " + phone + "]");
	}
	
	public void set(String name, int stuId, int age, String phone) {
		this.name = name;
		this.stuId = stuId;
		this.age = age;
		this.phone = phone;
	}
	
}
