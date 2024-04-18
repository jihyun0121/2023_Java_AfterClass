import java.util.ArrayList; 
import java.util.Scanner;

public class MenuMain {

		static Scanner sc = new Scanner(System.in);
		int menu;
		static Menu menuArr[] = new Menu[10];
		static ArrayList<Menu> stList = new ArrayList<Menu>();
		
	public static void main(String[] args) {

		stList.add(new Menu("������", 1106, 17, "010-2154-2189"));
		stList.add(new Menu("�̼���", 1309, 17, "010-8709-5869"));
		stList.add(new Menu("�̼Ҹ�", 1410, 17, "010-8807-3637"));
		stList.add(new Menu("���ڿ�", 1613, 17, "010-4876-3536"));
		
			//����
		while (true) {
			System.out.println("�л� ����");
			System.out.println("-----------\n"
				+ "1. �л� �Է�\n"
				+ "2. �л� �˻�\n"
				+ "3. �л� ��ȸ\n"
				+ "4. �л� ����\n"
				+ "5. �л� ����\n"
				+ "0. ����\n"
				+ "-----------");
			System.out.print("�޴��� ��ȣ�� �Է��ϼ��� : ");
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
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}//else
		}//while
			
	}
	//1. �л� �Է�
	public static void addrInput() {
		System.out.println("--�л� �Է�--");
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("�й��� �Է��ϼ��� : ");
		int stuId = sc.nextInt();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		String phone = sc.next();
//		LocalDateTime date = LocalDateTime.now();
		System.out.println("�ԷµǾ����ϴ�.");
		stList.add(new Menu(name, stuId, age, phone));
		System.out.println();
		
		
	}//input
	//2. �л� �˻�
	public static void addrSearch() {
		int count = 0;
		System.out.println("--�л� �˻�--");
		System.out.print("�˻��Ϸ��� �л��� �Է��ϼ��� : ");
		String search = sc.next();
		for (Menu student : stList) {
			if (student.name.equals(search)) {
				student.show();
			} else {
				//System.out.println("��ġ�ϴ� ������ �����ϴ�.");
				count++;
			}
			
		}//for
		if(count == stList.size()) {
				System.out.println("��ġ�ϴ� ������ �����ϴ�.");
			}
		System.out.println();
	}//search
	//3. �л� ��ȸ
	public static void addrOverallCheck() {
		for (Menu menu : stList) {
			menu.show();
		}
		System.out.println();
	}//check
	//4. �л� ����
	public static void addrUpdate() {
		int count= 0;
		System.out.println("--�л� ����--");
		System.out.print("�̸��� �Է��ϼ��� : ");
		String search = sc.next();
		for (Menu student : stList) {
			if (student.name.equals(search)) {
				student.show();
			}
		}
		System.out.println("�����Ͻðڽ��ϱ�? (��/�ƴϿ�) : ");
		String answ = sc.next();

		if (answ.equals("y") || answ.equals("Y") || answ.equals("��")) {
			for (Menu student : stList) {
				if (student.name.equals(search)) {
					System.out.println("--�ٲ� ������ �Է��ϼ���--");
					System.out.print("�̸��� �Է��ϼ��� : ");
					String name = sc.next();
					System.out.print("�й��� �Է��ϼ��� : ");
					int stuId = sc.nextInt();
					System.out.print("���̸� �Է��ϼ��� : ");
					int age = sc.nextInt();
					System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
					String phone = sc.next();
					
						System.out.println("�����Ǿ����ϴ�.");
						student.set(name,stuId,age,phone);
						System.out.println();
				} else {
					//System.out.println("��ġ�ϴ� ������ �����ϴ�.");
					count++;
				}
				
			}//for
			if(count == stList.size()) {
					System.out.println("��ġ�ϴ� ������ �����ϴ�.");
				}
		} else if (answ.equals("n") || answ.equals("N") || answ.equals("�ƴϿ�")) {
			System.out.println("��ҵǾ����ϴ�");
		}//else if
		
	}//update
	//5. �л� ����
	public static void addrDelete() {
		System.out.println("--�л� ����--");
		Menu student = null;
		for (int i = 0; i< stList.size(); i++) {
			System.out.println(i + ". " + student.print());
//			System.out.println(menu.print());
		}
		System.out.print("������ �л��� �Է��ϼ��� : ");
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
		
		System.out.println("���� �����Ͻðڽ��ϱ�? (��/�ƴϿ�) : ");
		String answ = sc.next();

		if (answ.equals("y") || answ.equals("Y") || answ.equals("��")) {
			for (int i = 0; i < stList.size(); i++) {
//				if (stList.get(i).name.equals(search)) {
//					stList.remove(i);
//				}//if
				if (stList.size() == search) {
					stList.remove(i);
				}//if
			}//for
        } else if (answ.equals("n") || answ.equals("N") || answ.equals("�ƴϿ�")) {
			System.out.println("��ҵǾ����ϴ�");
        } else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
        }//else
	}//delete
}//main
