//���赵, �ؾƲ, main() x
public class Student {
	//1. �Ӽ� - ��������
	String name;	//�̸�(name)
	int stuId;		//�й�(stuId)
	int age;		//����(age)
	String phone;		//����ó(phone
	//2. ������ Ŭ���� ����, return x
	public Student() {
		
	}
	public Student(String name, int stuId, int age, String phone) {
		this.name = name;
		this.stuId = stuId;
		this.age = age;
		this.phone = phone;
	}
	//3. �޼ҵ� ��ü�� �Ӽ����� ���
	public void display() {
		System.out.println(name + " " + stuId + " " + age + " " + phone);
	}
}
