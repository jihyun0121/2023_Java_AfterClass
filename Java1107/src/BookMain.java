
public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("누가 내 머리에 똥쌌어", "베르네");
		Book book2 = new Book("어린 왕자", "생텍쥐베리");
		Book book3 = new Book("자바 프로그래밍", "강은영");
		Book book4 = new Book("체육", "박향규");
		book1.show();
		book2.show();
		book3.show();
		book4.show();
		System.out.println("총 " + Book.count + "권");

	}

}
