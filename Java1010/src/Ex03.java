import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3���� �Է��ϼ���");
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " >>");
			try {
				n = sc.nextInt();
			} catch (Exception e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				sc.next();	//�Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
				i--;		//�ε����� �������� �ʵ��� �̸� ����
				continue;	//���� ����
			}//catch
			sum += n;
		}//for i
		System.out.println("���� " + sum);
		sc.close();
	}

}
