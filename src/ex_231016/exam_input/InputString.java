package ex_231016.exam_input;

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		String name, address;

		int age;

		System.out.print("이름을 입력해주세요.");
		name = a.next();

		System.out.print("나이를 입력해주세요.");
		age = a.nextInt();

		a.nextLine();
		// 중간에 남은 코드 정리 위해 실행
		// 버퍼에 \n이 남아있어 한줄로 인식하는것

		System.out.print("주소를 입력해주세요.");
		address = a.nextLine();

		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
		System.out.println("주소는 " + address);

		a.close();
	}
}
