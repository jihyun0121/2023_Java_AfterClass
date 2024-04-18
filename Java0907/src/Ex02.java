import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int sum = 0;
		int num1 = 0, num2 = 0;
		
		System.out.print(intArray.length + "개의 정수를 입력하시오 : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}	//for
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
			if (intArray[i] % 2 == 0) {
				num1 += intArray[i];
			} else {
				num2 += intArray[i];
			}
		}	//for
		System.out.println("평균은 " + (double)sum / intArray.length);
		System.out.println("짝수의 합은 " + num1);
		System.out.println("홀수의 합은 " + num2);
		sc.close();
	}

}
