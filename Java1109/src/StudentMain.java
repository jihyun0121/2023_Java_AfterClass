import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student("정국", 27, "010-1111-1111");
		Student st2 = new Student("양은서", 17, "010-2222-2222");
		Student st3 = new Student("윤주영", 17, "010-3333-3333");
		Student st4 = new Student("양혜원", 17, "010-4444-4444");
		
		ArrayList<Student> stList = new ArrayList<Student>();	//배열
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		stList.add(st4);
		stList.add(new Student("추다율", 17, "010-5555-5555"));
		for (Student student : stList) {
			//17세만 출력
			if (student.age == 17) {
				//방법 1
				System.out.println(student.name + " " + student.age + " " + student.phone);
				//방법 2
				student.show();
			}//if
			
		}//for
		System.out.println();
		for (int i = 0; i < stList.size(); i++) {
			if (stList.get(i).age == 17) {
				stList.get(i).show();
			}//if
		}//for
		System.out.println();
		for (Student student : stList) {
			if (student.name.equals("양혜원")) {
				student.show();
			}
		}
		System.out.println();
		for (int i = 0; i < stList.size(); i++) {
			if (stList.get(i).equals("양혜원")) {
				stList.get(i).show();;
			}
		}
	}

}
