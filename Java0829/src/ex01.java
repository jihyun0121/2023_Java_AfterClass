import java.util.Scanner;
//1~10������ ���� ���Ͻÿ�
//������ �Է¹ް� �Է¹��� �������� ���� ���Ͻÿ�
public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//��ĳ�� : ����ڿ��� ������ �Է¹���
		int sum = 0;	//�հ踦 ���� ���� ����
		int num = sc.nextInt();	//����ڿ��� �Է¹��� ������ num�� �Է�
		for (int i = 0; i <= num; i++) {	//num������ ������ ���� ���ϴ� for��
			sum += i;	//�հ� ���ϱ�
//			System.out.println(i + " " + sum);

		}
		System.out.println("���� = " + num + " �հ� = " + sum);		//������ �հ� ���
		
		int i = 0;
		sum = 0;
		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.println("���� = " + num + " �հ� = " + sum);
		sc.close();	//��ĳ�� �ݱ�
	}

}
