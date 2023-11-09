package ex_231030.phone_info;


import java.util.Scanner;

public class PhoneBookVer02 {
	static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.println("선택 : ");
	}

	public static void readData() {
		System.out.print("이름 : ");
		String name = keyboard.nextLine();

		System.out.print("전화번호 : ");
		String phone = keyboard.nextLine();

		System.out.print("생년월일 : ");
		String birthday = keyboard.nextLine();

		if (birthday.equals(""))
			birthday = null;

		PhoneInfo info = new PhoneInfo(name, phone, birthday);
		System.out.println("\n입력된 정보 출력...");
		info.showInfo();
	}

	public static void main(String[] args) {
		int choice;

		while (true) {
			showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();

			switch (choice) {
			case 1:
				readData();
				break;

			case 2:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

}
