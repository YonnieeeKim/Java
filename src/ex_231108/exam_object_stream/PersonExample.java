package ex_231108.exam_object_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PersonExample {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String file = "person.dat";
		output(file);
		input(file);
	}

	private static void input(String file) {
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream oos = new ObjectInputStream(fis)) {
			while (true) { //데이터 여러개일시 반복문 사용 현 예제는 사용안해도 됨
				Person p = (Person) oos.readObject(); //형변환
				System.out.println(p.toString());
			}
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (IOException io) {
			//파일의 끝까지 읽기때문에 무조건 해당 에러 발생함 
			//처리할 catch 이용
			//io.printStackTrace();
		}

	}

	private static void output(String file) {
		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			System.out.println("이름 :");
			String name = scan.nextLine();
			System.out.println("나이 : ");
			int age = scan.nextInt();
			scan.nextLine(); //엔터값 제외
			//순차적인 바이트로 만들어줘야 함
			oos.writeObject(new Person(name, age));
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
