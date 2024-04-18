import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("그룹명과 인원수 입력 : ");
		String group = sc.next();
		double sum = 0;
		int su = sc.nextInt();
		
		System.out.print("멤버 이름과 키 입력 : ");
		String name[] = new String[su];
		double ki[] = new double[su];
		for (int i = 0; i < su; i++) {
			name[i] = sc.next();
			ki[i] = sc.nextDouble();
			sum += ki[i];
		}
		sum = sum / su;
		System.out.println(group + "의 평균 키는 : " + sum);
		for (int i = 0; i < su; i++) {
			if (ki[i] >= 180) {
				System.out.println("키가 180 이상인 멤버는 " + name[i] + "입니다");
			}
		}
		//문별 163.4 솔라 160.5 휘인 158.9 화사 160
		sc.close();
	}

}
