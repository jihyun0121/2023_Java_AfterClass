
public class BookMain {

	public static void main(String[] args) {
		Book bk1 = new Book("�����","�������丮");
		System.out.println(bk1.title + " " + bk1.author);
		Book bk2 = new Book("������");
		System.out.println(bk2.title + " " + bk2.author);
		Book bk3 = new Book();
		bk3.title = "�ڹ�";
		bk3.author = "������";
		System.out.println();
	}

}
