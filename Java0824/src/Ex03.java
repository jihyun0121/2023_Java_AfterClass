import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		System.out.print("������ �Է��Ͻÿ� : ");
		int score = sc.nextInt();
				
		System.out.print("�г��� �Է��Ͻÿ� : ");
		int year = sc.nextInt();
		
		if (score >= 60) {
			if (year != 4) {
				System.out.println("�հ�");
			}
			else if (score >= 70) {
				System.out.println("�հ�");
			}
			else {
				System.out.println("���հ�");
			}
		}
		else {
			System.out.println("���հ�");
		}
		sc.close();
	}
}