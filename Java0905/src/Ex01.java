
public class Ex01 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {	//2단에서 9단
			for (int j = 1; j < 10; j++) {	//각 단의 구구단 출력
				System.out.print(i + " * " + j +" = " + i * j);	//곱셈 출력
				System.out.print('\t');	//하나씩 들여쓰기
			}	//j
			System.out.println();
		}	//i

	}

}
