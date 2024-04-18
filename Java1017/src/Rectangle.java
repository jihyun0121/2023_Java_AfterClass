
public class Rectangle {
	int width;
	int height;
	public Rectangle() {
		
	}
	public Rectangle(int width) {
		this.width = width;
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return width * height;		
	}
	public int Area() {
		return (width + height) * 2;		
	}
}
