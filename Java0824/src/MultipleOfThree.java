import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하시오 : ");
		int num = sc.nextInt();
		
		if (num % 3 == 0) {
			System.out.println(num + "3의 배수입니다");
			}
		else {
			System.out.println(num + "은 3의 배수가 아닙니다");
		}
		sc.close();

	}

}
