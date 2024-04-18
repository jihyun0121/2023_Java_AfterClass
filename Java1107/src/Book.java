
public class Book {
	String title;
	String author;
	static int count;
	
	public Book() {
		count++;
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		count++;
	}
	public void show() {
		System.out.println(title + ", " + author);
	}
	
}
