import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���Դϱ�? : ");
		int season = sc.nextInt();
		switch (season) {
			case 12 :
			case 1 :
			case 2 :
				System.out.println("�ܿ�");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println("��");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("����");
				break;
			default :
				System.out.println("����");
				break;
		}
			sc.close();
	}

}
