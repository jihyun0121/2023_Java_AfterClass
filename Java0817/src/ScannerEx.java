import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü���� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("�̸��� " + name);
		
		String city = sc.next();
		System.out.println("���ô� " + city);
		
		int age = sc.nextInt();
		System.out.println("���̴� " + age);
		
		double height = sc.nextDouble();
		System.out.println("�����Դ� " + height);
		
		sc.close();
	}

}
