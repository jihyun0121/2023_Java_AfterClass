import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� Ŀ�Ǹ� �帱���? : ");
		String order = sc.next();
		int price = 0;
		switch (order) {
			case "����������" :
			case "īǪġ��" :
			case "ī���" :
				price = 3500;
				break;
			case "�Ƹ޸�ī��" :
				price = 2000;
				break;
			default :
				System.out.println("�������� �ʴ� �޴��Դϴ�");
		}
		if (price != 0) {
			System.out.println(order + "�� " + price + "�� �Դϴ�");
		}
			sc.close();
	}

}
