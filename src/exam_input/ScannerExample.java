package exam_input;

import java.util.Scanner;

//이름, 도시, 나이, 독신여부 입력받아 출력
public class ScannerExample {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		String name, city;
		boolean single;

		int age;

		System.out.println("이름, 도시, 나이, 독신여부(true/false)를 빈칸으로 분리하여 입력하세요");
		
		name = a.next();
		System.out.println("이름은 "+name);

		
		city = a.next();
		System.out.println("도시는 "+city);
		

		age = a.nextInt();
		System.out.println("나이는 "+age);

		
		single = a.nextBoolean();

		
		System.out.println("독신여부는 " + ((single)? "미혼":"기혼"));

		a.close();
	}

}
