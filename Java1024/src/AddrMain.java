import java.util.Scanner;

public class AddrMain {

		static Scanner sc = new Scanner(System.in);
		int menu;
		static Addr addrArr[] = new Addr[10];
//		String nameArr[] = new String[10];
//		String tellArr[] = new String[10];
//		String comArr[] = new String[10];
		
	public static void main(String[] args) {
			//����
		while (true) {
		System.out.println("-----------\n"
				+ "1. �ּҷ� �Է�\n"
				+ "2. �ּҷ� �˻�\n"
				+ "3. �ּҷ� ��ȸ\n"
				+ "4. �ּҷ� ����\n"
				+ "5. �ּҷ� ����\n"
				+ "0. ����\n"
				+ "-----------");
		System.out.print("�޴��� �Է��ϼ��� : ");
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
	//1. �ּҷ� �Է�
	public static void addrInput() {
		System.out.println("--�ּҷ� �Է�--");
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
		String tell = sc.next();
		System.out.println("ȸ�� �̸��� �Է��ϼ��� : ");
		String company = sc.next();
		Addr addr1 = new Addr(name, tell, company);
		System.out.println(addr1.print());
	}
	//2. �ּҷ� �˻�
	public static void addrSearch() {
		System.out.println("--�ּҷ� �˻�--");
	}
	//4. �ּҷ� ����
	public static void addrUpdate() {
		System.out.println("--�ּҷ� ����--");
		System.out.print("�̸��� �Է��ϼ��� : ");
	}
	//5. �ּҷ� ����
	public static void addrDelete() {
		System.out.println("--�ּҷ� ����--");
		System.out.print("�̸��� �Է��ϼ��� : ");
//		String name = sc.next();
		System.out.println("���� �����Ͻðڽ��ϱ�?(y/n) ");
		String yesno = sc.next();
		if (!yesno.equalsIgnoreCase("y")) {
		      System.out.println("���� ���.");
		      return;
	}
		
	}
}
