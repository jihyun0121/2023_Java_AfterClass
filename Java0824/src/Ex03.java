import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		System.out.print("점수를 입력하시오 : ");
		int score = sc.nextInt();
				
		System.out.print("학년을 입력하시오 : ");
		int year = sc.nextInt();
		
		if (score >= 60) {
			if (year != 4) {
				System.out.println("합격");
			}
			else if (score >= 70) {
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		}
		else {
			System.out.println("불합격");
		}
		sc.close();
	}
}