package ex_231110.exam_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample01 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("test.txt", true);
		char[] data = "오늘 하루도 최선을 다해".toCharArray();

		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}

		StringBuffer sb = new StringBuffer();
		sb.append("신은 우리가 성공할 것을");
		sb.append("요구하지 않는다.\n");
		sb.append("우리가 노력할 것을 요구할");
		sb.append("뿐이다. (마더테레사)");

		writer.write(sb.toString());

		System.out.println("파일 출력 완료.");
		writer.flush();
		writer.close();
	}

}
