import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;		
		System.out.print("���� 5���� �Է��Ͻÿ� : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();	//���� 5�� �Է�
		}	//for
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] <= 0) {
				continue;	//����� �ƴ� ��� ���� �ݺ�����
			} else {
				sum += intArray[i];
			}
		}	//for
		System.out.println("����� ���� " + sum);
		sc.close();
	}

}
