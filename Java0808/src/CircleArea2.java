import java.util.Scanner;	//ctrl+shift+o
public class CircleArea2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;	//원주율을 상수로 선언
		
		System.out.print("원의 이름을 입력하시오 : ");
		String name = sc.next();
		
		System.out.print("반지름을 입력하시오 : ");
		double radius = sc.nextDouble();	//원의 반지름
		
		double circleArea = radius * radius * PI;	//원의 면적 계산
		
		//원의 면적을 화면에 출력한다.
		System.out.println("원의 이름 = " + name + " " + "반지름 = " + radius + " " + "원의 면적  = " + circleArea);
		sc.close();
	}

}
