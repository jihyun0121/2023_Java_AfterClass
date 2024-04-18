import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;	//정수의 개수
		int sum = 0;	//합
		
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요 : ");
		int n = sc.nextInt();	//정수 입력
		while (n != -1) {
			sum += n;
			count++;
			n = sc.nextInt();
		}
		if (count == 0) {
			System.out.println("입력된 수가 없습니다");
		}
		else {
			System.out.println("정수의 개수는 " + count + "개이며,");
			System.out.println("평균은 " + (double)sum/count + "입니다");
		}
		sc.close();
	}

}
