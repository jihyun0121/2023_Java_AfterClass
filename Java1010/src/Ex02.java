import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		int dividend;	//나뉨수
		int divisor;	//나눗수
		
		System.out.print("나뉨수를 입력하시오 : ");
		dividend = sc.nextInt();	//나뉨수 입력
		System.out.print("나눗수를 입력하시오 : ");
		divisor = sc.nextInt();		//나눗수 입력
		System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		sc.close();			
		} catch (Exception e) {
			System.out.println("0으로 나누어 에러가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}

}
