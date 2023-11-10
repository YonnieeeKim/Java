package ex_231110.exam_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadImage {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		int readByteNo;
		String website = "https://www.next-t.co.kr/public/uploads/7b7f7e2138e29e598cd0cdf2c85ea08d.jpg";
		try {
			URL url = new URL(website);
			URLConnection con = url.openConnection();
			in = new BufferedInputStream(con.getInputStream());

			out = new BufferedOutputStream(new FileOutputStream("img.jpg"));

			byte[] data = new byte[2048];
			while ((readByteNo = in.read(data)) != -1) {
				out.write(data, 0, readByteNo);
			}
			System.out.println(website + "에서 이미지를 다운로드 완료하였습니다.");

		} catch (MalformedURLException e) {
			System.out.println("URL ERROR");
		} catch (IOException i) {
			System.out.println("IO ERROR");
		} finally {
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (Exception e) {
				System.out.println("CLOSE ERROR");
			}
		}
	}

}
