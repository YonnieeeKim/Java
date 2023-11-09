package exam_class_basic;

public class movieTest {
	public static void main(String[] args) {
		Movie m = new Movie();
		
		m.movieData("제목", "감독", "23.10.24", "드라마");
		System.out.println(m.show());
	}

}
