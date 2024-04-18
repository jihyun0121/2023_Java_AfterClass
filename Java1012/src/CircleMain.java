//按眉 积己
public class CircleMain {

	public static void main(String[] args) {
		//按眉 1
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "阂绊扁 乔磊";
		double area = pizza.getArea();
		System.out.println(pizza.name + " 搁利 = " + area);
		//按眉 2
		Circle gong = new Circle();
		gong.radius = 5;
		gong.name = "丑备傍";
		area = gong.getArea();
		System.out.println(gong.name + " 搁利 = " + area);
		//按眉 3
		Circle donut = new Circle(2, "农覆檬内 档秤");
		area = donut.getArea();
		System.out.println(donut.name + " 搁利 = " + area);
	}

}
