//��ü ����
public class CircleMain {

	public static void main(String[] args) {
		//��ü 1
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "�Ұ�� ����";
		double area = pizza.getArea();
		System.out.println(pizza.name + " ���� = " + area);
		//��ü 2
		Circle gong = new Circle();
		gong.radius = 5;
		gong.name = "�󱸰�";
		area = gong.getArea();
		System.out.println(gong.name + " ���� = " + area);
		//��ü 3
		Circle donut = new Circle(2, "ũ������ ����");
		area = donut.getArea();
		System.out.println(donut.name + " ���� = " + area);
	}

}
