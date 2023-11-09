package exam_class_relation;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		this(0, 0, 0);
	}

	public Time(int h, int m, int s) {
		setTime(h, m, s);
	}

	public void setTime(int h, int m, int s) {
		hour = ((h >= 0 && h < 24) ? h : 0);
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 60) ? s : 0);
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
