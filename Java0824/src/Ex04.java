import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char grade;
		System.out.print("������ �Է��Ͻÿ� : ");
		int score = sc.nextInt();
		switch (score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
		}
		System.out.println(score + "���� " + grade + "���� �Դϴ�");
		sc.close();
	}

}
