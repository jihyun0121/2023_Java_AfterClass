
public class Student {
	//학생은 이름(name), 학번(stuId), 나이(age), 연락처(phone)
	//1. 필드
	String name;
	int age;
	String phone;
	//2. 생성자
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
