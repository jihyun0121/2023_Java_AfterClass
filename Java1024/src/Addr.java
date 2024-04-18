
public class Addr {
	String name;
	String tell;
	String company;
	public Addr() {}
	public Addr(String name, String tell, String company) {
		this.name = name;
		this.tell = tell;
		this.company = company;
	}
	
	public String print() {
		return "주소록 [이름 : " + name + ", 전화번호 : " + tell + ", 회사 : " + company + "]";
	}
}
