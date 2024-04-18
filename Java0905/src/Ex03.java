import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하시오 : ");
		int num1 = sc.nextInt();
		System.out.print("반과 점수를 입력하시오 : ");
		int sum = 0;
		int num = 0;
		double avr = 0;
		for (int i = 0; i < num1; i++) {
			int classnum = sc.nextInt();
			int student = sc.nextInt();
			if (classnum == 1 || classnum == 2) {
				num += 1;
				sum += student;
			} else {
				continue;
			}
		}	//for
		avr = (double)sum / (double)num;
		System.out.println("소프트웨어과의 합계는 " + sum);
		System.out.println("소프트웨어과의 평균은 " + avr);
		sc.close();
	}
}
