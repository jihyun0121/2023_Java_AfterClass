import java.util.Scanner;
//1~10까지의 합을 구하시오
//정수를 입력받고 입력받은 수까지의 합을 구하시오
public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//스캐너 : 사용자에게 정수를 입력받음
		int sum = 0;	//합계를 위한 변수 선언
		int num = sc.nextInt();	//사용자에게 입력받은 정수를 num에 입력
		for (int i = 0; i <= num; i++) {	//num까지의 정수의 합을 구하는 for문
			sum += i;	//합계 더하기
//			System.out.println(i + " " + sum);

		}
		System.out.println("정수 = " + num + " 합계 = " + sum);		//정수와 합계 출력
		
		int i = 0;
		sum = 0;
		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.println("정수 = " + num + " 합계 = " + sum);
		sc.close();	//스캐너 닫기
	}

}
