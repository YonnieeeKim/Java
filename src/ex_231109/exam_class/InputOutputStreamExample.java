package ex_231109.exam_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.sql.rowset.FilteredRowSet;

public class InputOutputStreamExample {
	public static void main(String[] args) {
		//try-catch-finally 문
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis= new FileInputStream("C:/Temp/intest.jpg");
			fos = new FileOutputStream("C:/Temp/outtest.jpg");
			int data = -1;
			
			while((data = fis.read())!= -1) {
				fos.write(data);
			}
			System.out.println("파일 복사가 완료되었습니다.");
		}catch (FileNotFoundException fnf) {
			System.out.println("파일이 존재하지 않거나 경로를 찾을 수 없음.");
		}catch (IOException io) {
			System.out.println("파일 입출력에 문제 발생");
		}catch(Exception e) {
			System.out.println("오류 발생");
		}finally {
			try {
				if(fis!=null)
					fis.close();
				if(fos!=null)
					fos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}	
		
		/*
		//try-with-resource 문
		try (FileInputStream fis = new FileInputStream("C:/Temp/intest.jpg");
			FileOutputStream fos = new FileOutputStream("C:/Temp/outtest.jpg")){
			
			int data = -1;
			
			while((data = fis.read())!= -1) {
				fos.write(data);
			}
			System.out.println("파일 복사가 완료되었습니다.");
		}catch (FileNotFoundException fnf) {
			System.out.println("파일이 존재하지 않거나 경로를 찾을 수 없음.");
		}catch (IOException io) {
			System.out.println("파일 입출력에 문제 발생");
		}catch(Exception e) {
			System.out.println("오류 발생");
		}
		*/
		
	}

}
