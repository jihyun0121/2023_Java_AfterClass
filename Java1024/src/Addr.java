
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
		return "�ּҷ� [�̸� : " + name + ", ��ȭ��ȣ : " + tell + ", ȸ�� : " + company + "]";
	}
}
