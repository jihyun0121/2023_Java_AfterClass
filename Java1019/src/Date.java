
public class Date {
	int year;
	int month;
	int day;
	
	public Date() {}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	void print1() {
		System.out.println(year + "." + month + "." + day);
	}
	void print2(){
		System.out.println(year + "³â" +  month + "¿ù" + day + "ÀÏ");		
	}
}
