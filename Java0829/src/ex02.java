import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;	//������ ����
		int sum = 0;	//��
		
		System.out.print("������ �Է��ϰ� �������� -1�� �Է��ϼ��� : ");
		int n = sc.nextInt();	//���� �Է�
		while (n != -1) {
			sum += n;
			count++;
			n = sc.nextInt();
		}
		if (count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�");
		}
		else {
			System.out.println("������ ������ " + count + "���̸�,");
			System.out.println("����� " + (double)sum/count + "�Դϴ�");
		}
		sc.close();
	}

}
