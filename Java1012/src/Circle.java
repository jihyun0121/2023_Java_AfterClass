//���赵, �ؾ Ʋ, main() x
public class Circle {
	//1. �Ӽ�
	int radius;	//������
	String name;	//���� �̸�
	//2. ������ (���� ����, Ŭ���� �̸��� ����, ������ ����)
	public Circle() {
		//��ü�� ���鶧 ȣ��, ������ ����
	}
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	//3. method ���� ���� ���ϱ�
	public double getArea() {
		double mj = 3.14 * radius * radius;
		return mj;
	}
}
