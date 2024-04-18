//설계도, 붕어빵 틀, main() x
public class Circle {
	//1. 속성
	int radius;	//반지름
	String name;	//원의 이름
	//2. 생성자 (리턴 없음, 클래스 이름과 동일, 여러개 가능)
	public Circle() {
		//객체를 만들때 호출, 할일을 지정
	}
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	//3. method 원의 면적 구하기
	public double getArea() {
		double mj = 3.14 * radius * radius;
		return mj;
	}
}
