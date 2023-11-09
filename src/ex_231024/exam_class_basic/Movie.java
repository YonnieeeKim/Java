package ex_231024.exam_class_basic;

import java.util.Date;

public class Movie {
	String title;
	String pd;
	String date;
	String genre;
	
	public void movieData(String t, String p, String s, String g) {
		title = t;
		pd = p;
		date = s;
		genre=g;

	}
	
	public String show() {
		return String.format("영화정보[ 제목 : %s, 감독 = %s, 개봉 = %s, 장르 = %s ]",title, pd, date, genre );
	}
	

}
