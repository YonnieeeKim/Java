package ex_231109.exam_throws;

import java.io.IOException;

public class ExceptionMethod1 {
	public static void main(String[] args) {
		System.out.println(readString());
	}

	public static String readString() {
		byte[] buf = new byte[100];
		System.out.print("문자열을 입력하시오 ");
		int readCount = 0;
		try {
			readCount = System.in.read(buf);
			System.out.println(readCount);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return new String(buf, 0, readCount - 2);
	}

}
