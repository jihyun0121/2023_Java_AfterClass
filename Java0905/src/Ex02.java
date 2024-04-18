import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 5개 입력하세요 : ");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (n <= 0)
				continue;
			else
				sum += n;	//양수인 경우 덧셈
		}	//for
		System.out.println("양수의 합은 " + sum);
		sc.close();
	}
}
