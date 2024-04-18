import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];	//배열 생성
		int max = 0;
		System.out.print("양수 5개를 입력하세요 : ");
		
		for (int i = 0; i < 5; i++) {
			intArray[i] = sc.nextInt();	//입력받은 정수를 배열에 입력
			if (intArray[i] > max) {	//intArray[i]가 현재 가장 큰 수보다 클경우
				max = intArray[i];	//intArray[i]를 max로 변경
			}	//if
		}	//for
		System.out.println("가장 큰 수는 " + max + "입니다.");
		sc.close();
	}

}
