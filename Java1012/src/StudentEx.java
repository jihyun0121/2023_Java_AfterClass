
public class StudentEx {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "������";
		st1.stuId = 1106;
		st1.age = 17;
		st1.phone = "010-2154-2189";
		st1.display();
		Student st2 = new Student("����ȿ", 3305, 16, "010-5632-2819");
		st2.display();
		Student st3 = new Student("������", 6723, 13, "010-7930-9052");
		st3.display();
	}

}
