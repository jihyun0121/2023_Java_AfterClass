
public class Student {
	//�л��� �̸�(name), �й�(stuId), ����(age), ����ó(phone)
	//1. �ʵ�
	String name;
	int age;
	String phone;
	//2. ������
	public Student() {	}
	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public void show() {
		System.out.println(name + " " + age + " " + phone);
	}
	
	
}
