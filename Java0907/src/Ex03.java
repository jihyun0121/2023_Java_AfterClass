import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;		
		System.out.print("정수 5개를 입력하시오 : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();	//정수 5개 입력
		}	//for
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] <= 0) {
				continue;	//양수가 아닌 경우 다음 반복으로
			} else {
				sum += intArray[i];
			}
		}	//for
		System.out.println("양수의 합은 " + sum);
		sc.close();
	}

}
