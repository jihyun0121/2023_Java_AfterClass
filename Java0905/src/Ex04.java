import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�");
		while (true) {
			System.out.println(">>");
			String text = sc.nextLine();
			if (text.equals("exit"))
				break;
		}	//while
		System.out.println("�����մϴ�...");
		sc.close();
	}
}
