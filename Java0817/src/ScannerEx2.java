import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		System.out.println("�̸�, �й�, ������ �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("�̸��� " + name);
		
		int number = sc.nextInt();
		System.out.println("�й��� " + number);
		
		String major = sc.next();
		System.out.println("������ " + major);
		
		sc.close();
	}

}
