import java.util.Scanner;

public class IceCream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int menu = 0;
		System.out.println("1. ������ �ܰ��� 3000");
		System.out.println("2. ��Ʈ���� 3000");
		System.out.println("3. ������ 1000");
		System.out.println("4. �� �Ҹ��� 3000");
		System.out.println("5. ü�� ����� 3500");
		System.out.println("6. ���� 800");
		System.out.println("7. �ٹ�� 900");
		System.out.println("-1. ����");
		do {
			System.out.println();
			System.out.print("���ϴ� �޴��� ���ڸ� �Է��Ͻÿ� : ");
			menu = sc.nextInt();
				if (menu != -1) {
					switch (menu) {
					case 1:
						System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
						int count = sc.nextInt();
						System.out.println("������ �ܰ��� " + count + "�� ");
						sum += 3000 * count;
						System.out.print(3000 * count + "��");
						continue;
					case 2:
						System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
						count = sc.nextInt();
						System.out.println("��Ʈ���� " + count + "��");
						sum += 3000 * count;
						System.out.print(3000 * count + "��");
						continue;
					case 4:
						System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
						count = sc.nextInt();
						System.out.println("�� �Ҹ��� " + count + "��");
						sum += 3000 * count;
						System.out.print(3000 * count + "��");
						continue;
					case 3:
						System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
						count = sc.nextInt();
						System.out.println("������ " + count + "��");
						sum += 1000 * count;
						System.out.print(1000 * count + "��");
						continue;
					case 5:
						System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
						count = sc.nextInt();
						System.out.println("ü�� ����� " + count + "��");
						sum += 3500 * count;
						System.out.print(3500 * count + "��");
						continue;
					case 6:
						System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
						count = sc.nextInt();
						System.out.println("���� " + count + "��");
						sum += 800 * count;
						System.out.print(800 * count + "��");
						continue;
					case 7:
						System.out.print("���ϴ� ������ �Է��Ͻÿ� : ");
						count = sc.nextInt();
						System.out.println("�ٹ�� " + count +"��");
						sum += 900 * count;
						System.out.print(900 * count + "��");
						continue;
					default:
						System.out.println("�߸� �Է��ϼ̽��ϴ�");
						continue;
					}	//switch
				}	//if
				else if (menu == -1) {
					System.out.println("�ý����� ����Ǿ����ϴ�");
					break;
				}	//else if
		} while (menu != -1);
			System.out.println();
			System.out.println("�� �ݾ��� " + sum + "�� �Դϴ�.");
			sc.close();
	}	//main
}