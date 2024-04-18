package jda;

import java.util.Scanner;

public class B2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		// 주사위 숫자 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int max = 0; // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)
		int prize = 0; // 상금

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				// 모든 눈이 같을 때
				if (arr[0] == arr[1] && arr[0] == arr[2] && arr[1] == arr[2]) {
					prize = 10000 + arr[i] * 1000;
					// 모든 눈이 다를 때
				} else if (arr[0] != arr[1] && arr[0] != arr[2] && arr[1] != arr[2]) {
					// 가장 큰 눈 구하기
					prize = (Math.max(arr[0], Math.max(arr[1], arr[2])) * 100);
				}

				// 같은 눈이 두개인 경우
				else {
					// 중복인 수 찾아내기
					if (arr[i] == arr[j]) {
						prize = 1000 + arr[j] * 100;
					}
				}
			}
		}
		System.out.println(prize);
	}

}