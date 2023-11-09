package ex_231024.exam_class_basic;

import java.util.Scanner;

public class Score {
	public String name;
	public int kor, eng, mat, total;
	double avg;
	public String grade;

    public static Scanner s = new Scanner(System.in);
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public static void setData(Score d) {
		System.out.println("이름 입력 : ");
		d.setName(s.next());
		System.out.println("국어점수 입력 : ");
		d.setKor(s.nextInt());
		System.out.println("영어점수 입력 : ");
		d.setEng(s.nextInt());
		System.out.println("수학점수 입력 : ");
		d.setMat(s.nextInt());
	}

	public void getTotal() {
		total = kor + eng + mat;
	}

	public double getAverage() {
		return avg = (double) total / 3;
	}

	public String getGrade() {
		if (avg >= 90)
			grade = "A";
		else if (avg >= 80)
			grade = "B";
		else if (avg >= 70)
			grade = "C";
		else if (avg >= 60)
			grade = "D";
		else
			grade = "F";

		return grade;
	}

	public String show() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%s", name, kor, eng, mat, total, getAverage(), getGrade());
	}
	
	public static void main(String[] args) {
		Score s0 = new Score();
		Score s1 = new Score();
		Score s2 = new Score();

		setData(s0);
		s0.getTotal();
		s0.getAverage();

		setData(s1);
		s1.getTotal();
		s1.getAverage();

		setData(s2);
		s2.getTotal();
		s2.getAverage();

		System.out.println("===================================================");
		String[] sub = { "이름", "국어", "영어", "수학", "총점", "평균", "학점" };
		for (int i = 0; i < sub.length; i++) {
			System.out.printf("%s\t", sub[i]);
		}
		System.out.println("\n===================================================");

		System.out.println(s0.show());
		System.out.println(s1.show());
		System.out.println(s2.show());
	}
}
