import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("무슨 커피를 드릴까요? : ");
		String order = sc.next();
		int price = 0;
		switch (order) {
			case "에스프레소" :
			case "카푸치노" :
			case "카페라떼" :
				price = 3500;
				break;
			case "아메리카노" :
				price = 2000;
				break;
			default :
				System.out.println("존재하지 않는 메뉴입니다");
		}
		if (price != 0) {
			System.out.println(order + "는 " + price + "원 입니다");
		}
			sc.close();
	}

}
