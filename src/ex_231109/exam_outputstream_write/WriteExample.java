package ex_231109.exam_outputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/Temp/test.txt");

			// getBytes() 메서드는 문자열을 바이트 배열로 변환하여 반환하는 메서드
			byte[] data = "Hello! Java".getBytes();
			os.write(data);

			for (int i = 0; i < data.length; i++) {
				System.out.println(data[i]);
			}

			/*
			 * byte[] data = "Java".getBytes();
			 * 
			byte[] data = "Hello! Java".getBytes();
			os.write(data);

			byte[] data = "HelloWorld! Java".getBytes();
			os.write(data, 1, 2);
			
			byte[] data = "God doesn't require us to succeed. \n he only required that you try.".getBytes();
			os.write(data);
			*/
			
			System.out.println("파일 생성되었습니다.");
		} catch (FileNotFoundException fnf) {
			System.out.println("저장할 폴더가 생성되어 있지 않습니다.");
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (os != null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
