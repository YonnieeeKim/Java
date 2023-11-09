package cafe_class_exam;

import java.util.Scanner;

public class EmployeeInfo {
	Scanner s = new Scanner(System.in);
	private String empno;
	private int gi;
	private int su;
	private int se;
	private int bong;
	private String grade;

	public EmployeeInfo(String empno, int gi) {
		this.empno = empno;
		this.setGi(gi);
		setSu();setSe();setBong();setGrade();
	}

	public int getSu() {
		return su;
	}

	public void setSu() {
		this.su = (int) (getGi() * 0.15);
	}

	public int getSe() {
		return se;
	}

	public void setSe() {
		this.se = (int) (getGi() * 0.2);
	}

	public int getBong() {
		return bong;
	}

	public void setBong() {
		this.bong = getGi() + su - se;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (bong >= 500000)
			this.grade = "관리자";
		else
			this.grade = "영업";
	}

	public void show() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%s\n", empno, getGi(), su, se, bong, grade);
	}

	public int getGi() {
		return gi;
	}

	public void setGi(int gi) {
		this.gi = gi;
	}

}
