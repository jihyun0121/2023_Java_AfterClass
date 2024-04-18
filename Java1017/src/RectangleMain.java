
public class RectangleMain {

	public static void main(String[] args) {
		Rectangle box = new Rectangle(30, 25);
		Rectangle colpaper = new Rectangle(5, 5);
		Rectangle notebook = new Rectangle(30, 15);
		System.out.println("면적 : " + box.getArea() + ", 둘레 : " + box.Area());
		System.out.println("면적 : " + colpaper.getArea() + ", 둘레 : " + colpaper.Area());
		System.out.println("면적 : " + notebook.getArea() + ", 둘레 : " + notebook.Area());
	}

}
