
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
		return "제목 : " + title + 
				"\n평점 : " + star + 
				"\n감독 : " + director + 
				"\n발표 연도 : " + year;
	}
}
