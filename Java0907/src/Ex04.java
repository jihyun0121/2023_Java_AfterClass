import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height[] = new double[5];
		double sum = 0;		
		System.out.print("5명의 키를 입력하시오 : ");
		for (int i = 0; i < height.length; i++) {
			height[i] = sc.nextDouble();
			sum += height[i];	
		}	//for i
		System.out.println("평균 키는 " + sum / height.length);
		sc.close();
	}
}
