import java.util.Scanner;

public class IceCream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int menu = 0;
		System.out.println("1. 엄마는 외계인 3000");
		System.out.println("2. 민트초코 3000");
		System.out.println("3. 누가바 1000");
		System.out.println("4. 블랙 소르베 3000");
		System.out.println("5. 체리 쥬빌레 3500");
		System.out.println("6. 비비빅 800");
		System.out.println("7. 바밤바 900");
		System.out.println("-1. 종료");
		do {
			System.out.println();
			System.out.print("원하는 메뉴의 숫자를 입력하시오 : ");
			menu = sc.nextInt();
				if (menu != -1) {
					switch (menu) {
					case 1:
						System.out.print("원하는 개수를 입력하시오 : ");
						int count = sc.nextInt();
						System.out.println("엄마는 외계인 " + count + "개 ");
						sum += 3000 * count;
						System.out.print(3000 * count + "원");
						continue;
					case 2:
						System.out.print("원하는 개수를 입력하시오 : ");
						count = sc.nextInt();
						System.out.println("민트초코 " + count + "개");
						sum += 3000 * count;
						System.out.print(3000 * count + "원");
						continue;
					case 4:
						System.out.print("원하는 개수를 입력하시오 : ");
						count = sc.nextInt();
						System.out.println("블랙 소르베 " + count + "개");
						sum += 3000 * count;
						System.out.print(3000 * count + "원");
						continue;
					case 3:
						System.out.print("원하는 개수를 입력하시오 : ");
						count = sc.nextInt();
						System.out.println("누가바 " + count + "개");
						sum += 1000 * count;
						System.out.print(1000 * count + "원");
						continue;
					case 5:
						System.out.print("원하는 개수를 입력하시오 : ");
						count = sc.nextInt();
						System.out.println("체리 쥬빌레 " + count + "개");
						sum += 3500 * count;
						System.out.print(3500 * count + "원");
						continue;
					case 6:
						System.out.print("원하는 개수를 입력하시오 : ");
						count = sc.nextInt();
						System.out.println("비비빅 " + count + "개");
						sum += 800 * count;
						System.out.print(800 * count + "원");
						continue;
					case 7:
						System.out.print("원하는 개수를 입력하시오 : ");
						count = sc.nextInt();
						System.out.println("바밤바 " + count +"개");
						sum += 900 * count;
						System.out.print(900 * count + "원");
						continue;
					default:
						System.out.println("잘못 입력하셨습니다");
						continue;
					}	//switch
				}	//if
				else if (menu == -1) {
					System.out.println("시스템이 종료되었습니다");
					break;
				}	//else if
		} while (menu != -1);
			System.out.println();
			System.out.println("총 금액은 " + sum + "원 입니다.");
			sc.close();
	}	//main
}