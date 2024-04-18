
public class BookMain {

	public static void main(String[] args) {
		Book bk1 = new Book("어린왕자","생텍쥐페리");
		System.out.println(bk1.title + " " + bk1.author);
		Book bk2 = new Book("춘향전");
		System.out.println(bk2.title + " " + bk2.author);
		Book bk3 = new Book();
		bk3.title = "자바";
		bk3.author = "강은영";
		System.out.println();
	}

}
