package ex_231107.exam_collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		// 프로그래밍 언어(문자열)를 저장하도록 인스턴스 생성
		ArrayList<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("Java");
		list.add("JSP");
		list.add("SPRING");

		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();

		list.add(1, "ORACLE");
		list.set(2, "Client programming");
		list.remove(3);

		int index = list.indexOf("Java");
		System.out.println(index);

		index = list.lastIndexOf("Java");
		System.out.println(index);

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		System.out.println();
		System.out.println("list가 가진 모든 원소를 문자열로 반환");
		System.out.println(list.toString());
		System.out.println();

		// 정수값을 저장하도록 인스턴스 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(23);
		list1.add(94);
		list1.add(Integer.valueOf(62));
		list1.add(Integer.valueOf(45));

		System.out.println();

		list1.add(2, Integer.valueOf(78));
		System.out.println(list1.toString());
		System.out.println();

		// Apple이라는 이름으로 클래스를 생성한다.
		// 이 클래스는 품종(kind)와 색상(color)을 필드로 가진다.
		// 여러 사과를 저장하도록 인스턴스 생성

		class Apple {
			String kind, color;

			Apple(String kind, String color) {
				this.color = color;
				this.kind = kind;
			}

			public String getKind() {
				return kind;
			}

			public void setKind(String kind) {
				this.kind = kind;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String toString() {
				return "Apple [color : " + color + "]";
			}
		}

		ArrayList<Apple> list2 = new ArrayList<Apple>();
		list2.add(new Apple("부사", "빨강"));
		list2.add(new Apple("아오리", "청색"));
		list2.add(new Apple("썸머킹", "황금"));
		list2.add(new Apple("홍로", "빨강"));

		// 출력-1
		for (int i = 0; i < list2.size(); i++) {
			System.out.print("품종 : " + list2.get(i).getKind());
			System.out.println(", 색상 : " + list2.get(i).getColor());
		}
		System.out.println();

		// 출력-2
		for (int i = 0; i < list2.size(); i++) {
			Apple app = list2.get(i);
			System.out.print("품종 : " + app.getKind());
			System.out.println(", 색상 : " + app.getColor());
		}
		System.out.println();

		// 출력-3 : for~each
		for (Apple app : list2) {
			System.out.println(app.toString());
		}
		System.out.println();

		// 출력-4 : 반복자로 출력
		Iterator<Apple> iter = list2.iterator();
		while (iter.hasNext()) { // 현재 커서 다음에 데이터가 존재하는지 판단
			Apple apple = iter.next();// 커서 다음의 데이터를 반환하고 다음 데이터로 이동
			System.out.println(apple.toString());
		}
		System.out.println("list2가 가진 모든 원소를 문자열로 반환");
		System.out.println(list2.toString());
		System.out.println();

		// 여러 영화 정보를 저장하도록 인스턴스 생성
		class Movie {
			String title, date;

			Movie(String title, String date) {
				this.date = date;
				this.title = title;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDate() {
				return date;
			}

			public void setDate(String date) {
				this.date = date;
			}

			public String toString() {
				return "Movie [영화제목 : " + title + ", 개봉일 : " + date + "]";
			}

		}

		ArrayList<Movie> list3 = new ArrayList<Movie>();
		list3.add(new Movie("그대들은 어떻게 살 것인가", "231025"));
		list3.add(new Movie("소년들", "231101"));
		list3.add(new Movie("30일", "231003"));
		list3.add(new Movie("톡투미", "231101"));

		// 출력-1
		for (int i = 0; i < list2.size(); i++) {
			Movie mo = list3.get(i);
			System.out.print("제목 : " + mo.getTitle());
			System.out.println(", 개봉일 : " + mo.getDate());
		}
		System.out.println();

		// 출력-2 반복자
		Iterator<Movie> it = list3.iterator();
		while (it.hasNext()) {
			Movie me = it.next();
			System.out.println(me.toString());
		}
	}

}
