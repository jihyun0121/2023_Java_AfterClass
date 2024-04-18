import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		System.out.println("이름, 학번, 전공을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("이름은 " + name);
		
		int number = sc.nextInt();
		System.out.println("학번은 " + number);
		
		String major = sc.next();
		System.out.println("전공은 " + major);
		
		sc.close();
	}

}
