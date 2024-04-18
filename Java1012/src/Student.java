//설계도, 붕어빵틀, main() x
public class Student {
	//1. 속성 - 변수선언
	String name;	//이름(name)
	int stuId;		//학번(stuId)
	int age;		//나이(age)
	String phone;		//연락처(phone
	//2. 생성자 클래스 동일, return x
	public Student() {
		
	}
	public Student(String name, int stuId, int age, String phone) {
		this.name = name;
		this.stuId = stuId;
		this.age = age;
		this.phone = phone;
	}
	//3. 메소드 객체의 속성들을 출력
	public void display() {
		System.out.println(name + " " + stuId + " " + age + " " + phone);
	}
}
