
public class RectangleMain {

	public static void main(String[] args) {
		Rectangle box = new Rectangle(30, 25);
		Rectangle colpaper = new Rectangle(5, 5);
		Rectangle notebook = new Rectangle(30, 15);
		System.out.println("���� : " + box.getArea() + ", �ѷ� : " + box.Area());
		System.out.println("���� : " + colpaper.getArea() + ", �ѷ� : " + colpaper.Area());
		System.out.println("���� : " + notebook.getArea() + ", �ѷ� : " + notebook.Area());
	}

}
