import java.util.ArrayList; 
import java.util.Scanner;

public class MenuMain {

		static Scanner sc = new Scanner(System.in);
		int menu;
		static Menu menuArr[] = new Menu[10];
		static ArrayList<Menu> stList = new ArrayList<Menu>();
		
	public static void main(String[] args) {

		stList.add(new Menu("백지현", 1106, 17, "010-2154-2189"));
		stList.add(new Menu("이성미", 1309, 17, "010-8709-5869"));
		stList.add(new Menu("이소리", 1410, 17, "010-8807-3637"));
		stList.add(new Menu("이자연", 1613, 17, "010-4876-3536"));
		
			//루프
		while (true) {
			System.out.println("학생 관리");
			System.out.println("-----------\n"
				+ "1. 학생 입력\n"
				+ "2. 학생 검색\n"
				+ "3. 학생 조회\n"
				+ "4. 학생 수정\n"
				+ "5. 학생 삭제\n"
				+ "0. 종료\n"
				+ "-----------");
			System.out.print("메뉴의 번호를 입력하세요 : ");
			int num = sc.nextInt();
			System.out.println();
			if (num == 1) {
				addrInput();
			} else if (num == 2) {
				addrSearch();
			} else if (num == 3) {
				addrOverallCheck();
			} else if (num == 4) {
				addrUpdate(); 
			} else if (num == 5) {
				addrDelete(); 
			} else if (num == 0) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다");
			}//else
		}//while
			
	}
	//1. 학생 입력
	public static void addrInput() {
		System.out.println("--학생 입력--");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("학번을 입력하세요 : ");
		int stuId = sc.nextInt();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("전화번호를 입력하세요 : ");
		String phone = sc.next();
//		LocalDateTime date = LocalDateTime.now();
		System.out.println("입력되었습니다.");
		stList.add(new Menu(name, stuId, age, phone));
		System.out.println();
		
		
	}//input
	//2. 학생 검색
	public static void addrSearch() {
		int count = 0;
		System.out.println("--학생 검색--");
		System.out.print("검색하려는 학생을 입력하세요 : ");
		String search = sc.next();
		for (Menu student : stList) {
			if (student.name.equals(search)) {
				student.show();
			} else {
				//System.out.println("일치하는 정보가 없습니다.");
				count++;
			}
			
		}//for
		if(count == stList.size()) {
				System.out.println("일치하는 정보가 없습니다.");
			}
		System.out.println();
	}//search
	//3. 학생 조회
	public static void addrOverallCheck() {
		for (Menu menu : stList) {
			menu.show();
		}
		System.out.println();
	}//check
	//4. 학생 수정
	public static void addrUpdate() {
		int count= 0;
		System.out.println("--학생 수정--");
		System.out.print("이름을 입력하세요 : ");
		String search = sc.next();
		for (Menu student : stList) {
			if (student.name.equals(search)) {
				student.show();
			}
		}
		System.out.println("수정하시겠습니까? (예/아니오) : ");
		String answ = sc.next();

		if (answ.equals("y") || answ.equals("Y") || answ.equals("예")) {
			for (Menu student : stList) {
				if (student.name.equals(search)) {
					System.out.println("--바꿀 내용을 입력하세요--");
					System.out.print("이름을 입력하세요 : ");
					String name = sc.next();
					System.out.print("학번을 입력하세요 : ");
					int stuId = sc.nextInt();
					System.out.print("나이를 입력하세요 : ");
					int age = sc.nextInt();
					System.out.print("전화번호를 입력하세요 : ");
					String phone = sc.next();
					
						System.out.println("수정되었습니다.");
						student.set(name,stuId,age,phone);
						System.out.println();
				} else {
					//System.out.println("일치하는 정보가 없습니다.");
					count++;
				}
				
			}//for
			if(count == stList.size()) {
					System.out.println("일치하는 정보가 없습니다.");
				}
		} else if (answ.equals("n") || answ.equals("N") || answ.equals("아니오")) {
			System.out.println("취소되었습니다");
		}//else if
		
	}//update
	//5. 학생 삭제
	public static void addrDelete() {
		System.out.println("--학생 삭제--");
		Menu student = null;
		for (int i = 0; i< stList.size(); i++) {
			System.out.println(i + ". " + student.print());
//			System.out.println(menu.print());
		}
		System.out.print("삭제할 학생을 입력하세요 : ");
//		String search = sc.next();
		int search = sc.nextInt();
		for (Menu student1 : stList) {
//			if (student.name.equals(search)) {
//				student.show();
//			}//if
			if (stList.size() == search) {
				student1.show();
			}//if
		}//for
		
		System.out.println("정말 삭제하시겠습니까? (예/아니오) : ");
		String answ = sc.next();

		if (answ.equals("y") || answ.equals("Y") || answ.equals("예")) {
			for (int i = 0; i < stList.size(); i++) {
//				if (stList.get(i).name.equals(search)) {
//					stList.remove(i);
//				}//if
				if (stList.size() == search) {
					stList.remove(i);
				}//if
			}//for
        } else if (answ.equals("n") || answ.equals("N") || answ.equals("아니오")) {
			System.out.println("취소되었습니다");
        } else {
			System.out.println("잘못 입력하셨습니다");
        }//else
	}//delete
}//main
