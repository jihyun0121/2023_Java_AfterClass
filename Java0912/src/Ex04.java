import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�׷��� �ο��� �Է� : ");
		String group = sc.next();
		double sum = 0;
		int su = sc.nextInt();
		
		System.out.print("��� �̸��� Ű �Է� : ");
		String name[] = new String[su];
		double ki[] = new double[su];
		for (int i = 0; i < su; i++) {
			name[i] = sc.next();
			ki[i] = sc.nextDouble();
			sum += ki[i];
		}
		sum = sum / su;
		System.out.println(group + "�� ��� Ű�� : " + sum);
		for (int i = 0; i < su; i++) {
			if (ki[i] >= 180) {
				System.out.println("Ű�� 180 �̻��� ����� " + name[i] + "�Դϴ�");
			}
		}
		//���� 163.4 �ֶ� 160.5 ���� 158.9 ȭ�� 160
		sc.close();
	}

}
