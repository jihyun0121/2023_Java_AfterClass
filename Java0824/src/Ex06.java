import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 월입니까? : ");
		int season = sc.nextInt();
		switch (season) {
			case 12 :
			case 1 :
			case 2 :
				System.out.println("겨울");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println("봄");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("여름");
				break;
			default :
				System.out.println("가을");
				break;
		}
			sc.close();
	}

}
