
public class MovieMain {

	public static void main(String[] args) {
		Movie mv1 = new Movie("밀수", 7.99, "류승완", 2023);
		Movie mv2 = new Movie("더 퍼스트 슬램덩크", 9.26, "이노우에 다케히코", 2023);
		System.out.println(mv1.print());
		System.out.println();
		System.out.println(mv2.print());

	}

}
