import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		
		if (num % 3 == 0) {
			System.out.println(num + "3�� ����Դϴ�");
			}
		else {
			System.out.println(num + "�� 3�� ����� �ƴմϴ�");
		}
		sc.close();

	}

}
