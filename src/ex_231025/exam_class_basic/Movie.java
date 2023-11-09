package ex_231025.exam_class_basic;

import java.util.Scanner;

public class Movie {
	private String movieTitle;
	private String movieGrade;
	private String movieDirecter;
	private String movieYear;

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieGrade() {
		return movieGrade;
	}

	public void setMovieGrade(String movieGrade) {
		this.movieGrade = movieGrade;
	}

	public String getMovieDirecter() {
		return movieDirecter;
	}

	public void setMovieDirecter(String movieDirecter) {
		this.movieDirecter = movieDirecter;
	}

	public String getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}
	
	public static Scanner s = new Scanner(System.in);
	public static void movieData(Movie mv) {
		System.out.println("영화정보를 입력하세요. (영화, 평점, 감독, 개봉연도)");
		System.out.print("영화제목 : ");
		mv.setMovieTitle(s.nextLine());
		System.out.print("영화평점 : ");
		mv.setMovieGrade(s.nextLine());
		System.out.print("영화감독 : ");
		mv.setMovieDirecter(s.nextLine());
		System.out.print("개봉연도 : ");
		mv.setMovieYear(s.nextLine());

	}
	
	public void show() {
		System.out.println("영화이름 : "+movieTitle+" 영화평점 : "+movieGrade+" 영화감독 : "+movieDirecter+" 개봉연도 : "+movieYear);
	}
	
	
	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		
		movieData(m1);
		movieData(m2);
		m1.show();
		m2.show();
	}

}
