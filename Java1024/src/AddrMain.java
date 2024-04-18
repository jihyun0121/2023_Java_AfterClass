import java.util.Scanner;

public class AddrMain {

		static Scanner sc = new Scanner(System.in);
		int menu;
		static Addr addrArr[] = new Addr[10];
//		String nameArr[] = new String[10];
//		String tellArr[] = new String[10];
//		String comArr[] = new String[10];
		
	public static void main(String[] args) {
			//루프
		while (true) {
		System.out.println("-----------\n"
				+ "1. 주소록 입력\n"
				+ "2. 주소록 검색\n"
				+ "3. 주소록 조회\n"
				+ "4. 주소록 수정\n"
				+ "5. 주소록 삭제\n"
				+ "0. 종료\n"
				+ "-----------");
		System.out.print("메뉴를 입력하세요 : ");
		int num = sc.nextInt();
		if (num == 1) {
			addrInput();
		}else if (num == 2) {
			addrSearch();
		}else if (num == 3) {
			//addrOverallCheck();
		}else if (num == 4) {
			addrUpdate(); 
		}else if (num == 5) {
			addrDelete(); 
		}else if (num == 0) {
			
		}else {

		}
	}
			
	}
	//1. 주소록 입력
	public static void addrInput() {
		System.out.println("--주소록 입력--");
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("전화번호를 입력하세요 : ");
		String tell = sc.next();
		System.out.println("회사 이름을 입력하세요 : ");
		String company = sc.next();
		Addr addr1 = new Addr(name, tell, company);
		System.out.println(addr1.print());
	}
	//2. 주소록 검색
	public static void addrSearch() {
		System.out.println("--주소록 검색--");
	}
	//4. 주소록 수정
	public static void addrUpdate() {
		System.out.println("--주소록 수정--");
		System.out.print("이름을 입력하세요 : ");
	}
	//5. 주소록 삭제
	public static void addrDelete() {
		System.out.println("--주소록 삭제--");
		System.out.print("이름을 입력하세요 : ");
//		String name = sc.next();
		System.out.println("정말 삭제하시겠습니까?(y/n) ");
		String yesno = sc.next();
		if (!yesno.equalsIgnoreCase("y")) {
		      System.out.println("삭제 취소.");
		      return;
	}
		
	}
}
