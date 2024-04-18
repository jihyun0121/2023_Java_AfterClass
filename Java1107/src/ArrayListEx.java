import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//배열, 크기가 정해지지 않은 배열
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("사과");
		strList.add("바나나");
		strList.add("샤인머스켓");
		strList.add("배");
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		System.out.println(strList.get(3));
		System.out.println();
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(42);
		intList.add(22);
		intList.add(18);
		intList.add(24);
		intList.add(7);
		System.out.println();
		intList.add(12);for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("누가 내 머리에 똥쌌어", "베르네"));
		bookList.add(new Book("어린 왕자", "생텍쥐베리"));
		bookList.add(new Book("자바 프로그래밍", "강은영"));
		bookList.add(new Book("체육", "박향규"));
		System.out.println();
		System.out.println();
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i).title + ", " + bookList.get(i).author);
		}
		
		ArrayList<Double> dbList = new ArrayList<Double>();
		dbList.add(3.14);		//0
		dbList.add(0.12);		//1 -> 2
		dbList.add(1.23);		//2 -> 3
		dbList.add(1, 0.12);	//1
		//forEach문 반복 가능
		for (Double item : dbList) {
			System.out.println(item);
		}
	}

}
