import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];	//�迭 ����
		int max = 0;
		System.out.print("��� 5���� �Է��ϼ��� : ");
		
		for (int i = 0; i < 5; i++) {
			intArray[i] = sc.nextInt();	//�Է¹��� ������ �迭�� �Է�
			if (intArray[i] > max) {	//intArray[i]�� ���� ���� ū ������ Ŭ���
				max = intArray[i];	//intArray[i]�� max�� ����
			}	//if
		}	//for
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		sc.close();
	}

}
