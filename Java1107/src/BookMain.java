
public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("���� �� �Ӹ��� �˽վ�", "������");
		Book book2 = new Book("� ����", "�����㺣��");
		Book book3 = new Book("�ڹ� ���α׷���", "������");
		Book book4 = new Book("ü��", "�����");
		book1.show();
		book2.show();
		book3.show();
		book4.show();
		System.out.println("�� " + Book.count + "��");

	}

}
