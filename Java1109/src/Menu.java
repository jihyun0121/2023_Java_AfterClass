
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
		return "[�̸� : " + name + ", �й� : " + stuId + ", ���� : " + age + ", ��ȭ��ȣ : " + phone + "]";
	}
	
	public void show() {
		System.out.println("�л� [�̸� : " + name + ", �й� : " + stuId + ", ���� : " + age + ", ��ȭ��ȣ : " + phone + "]");
	}
	
	public void set(String name, int stuId, int age, String phone) {
		this.name = name;
		this.stuId = stuId;
		this.age = age;
		this.phone = phone;
	}
	
}
