
public class Movie {
	String title;
	double star;
	String director;
	int year;
	public Movie() {}
	public Movie(String title, double star, String director, int year) {
		this.title = title;
		this.star = star;
		this.director = director;
		this.year = year;
	}
	public String print() {
		return "���� : " + title + 
				"\n���� : " + star + 
				"\n���� : " + director + 
				"\n��ǥ ���� : " + year;
	}
}
