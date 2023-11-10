package ex_231110.exam_network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class URLOpenStreamTest01 {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			URL url = new URL("https://www.hanbit.co.kr/");
			// url.openStream()의 반환형 : InputStream
			// InputStream => InputStreamReader로 바이트 스트림을 문자스트림으로 변환 => BufferedReader
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			//PrintWriter : println, printf 줄바꿈 기능 들어있음
			out = new PrintWriter(new FileWriter("index.html"));
			String inLine;
			while ((inLine = in.readLine()) != null) {
				//System.out.println(inLine);
				out.println(inLine);
			}
			System.out.println("파일 복사 완료");
		} catch (MalformedURLException e) {
			System.out.println("URL ERROR");
		} catch (IOException i) {
			System.out.println("IO ERROR");
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (Exception e) {
				System.out.println("CLOSE ERROR");
			}
		}

	}
}
