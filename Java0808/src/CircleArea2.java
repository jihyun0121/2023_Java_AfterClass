import java.util.Scanner;	//ctrl+shift+o
public class CircleArea2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;	//�������� ����� ����
		
		System.out.print("���� �̸��� �Է��Ͻÿ� : ");
		String name = sc.next();
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		double radius = sc.nextDouble();	//���� ������
		
		double circleArea = radius * radius * PI;	//���� ���� ���
		
		//���� ������ ȭ�鿡 ����Ѵ�.
		System.out.println("���� �̸� = " + name + " " + "������ = " + radius + " " + "���� ����  = " + circleArea);
		sc.close();
	}

}
