package ex_231109.exam_inputstream_read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("C:/Temp/test.txt");
			System.out.println("[읽어들인문자]");

			/*
			 * int readByte; while(true) { readByte = is.read(); if(readByte == -1 )break;
			 * System.out.println((char)readByte); }
			 */

			int readByteNo;
			byte[] readBytes = new byte[4];

			String data = "";
			while (true) {
				// 읽어들인 바이트 값을 바이트 배열에 저장하고 그 바이트 수를 반환.
				readByteNo = is.read(readBytes);
				System.out.println("읽은 바이트 수 : " + readByteNo);// 확인코드
				if (readByteNo == -1)
					break;
				data += new String(readBytes, 0, readByteNo);
			}
			System.out.println(data);

			/*
			 * int readByteNo; byte[] readBytes = new byte[10]; //read 바이트 배열에 저장할 길이 수는 5,
			 * 배열의 저장 위치는 2번째부터 readByteNo = is.read(readBytes,2,5);
			 * System.out.println("리턴 바이트 수 : "+readByteNo);
			 * 
			 * for(int i=0;i<readBytes.length;i++) { System.out.println((char)readBytes[i]);
			 * }
			 */

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
