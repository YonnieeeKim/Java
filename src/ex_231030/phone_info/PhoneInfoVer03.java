package ex_231030.phone_info;


import java.util.Scanner;

public class PhoneInfoVer03 {

	public static void main(String[] args) {
		PhoneBookManager p1 = new PhoneBookManager();
		Scanner keyboard = new Scanner(System.in);
		int choice;

		while (true) {
			p1.showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();

			switch (choice) {
			case 1:
				p1.inputData();
				break;

			case 2:
				p1.findData();
				break;

			case 3:
				p1.deleteData();
				break;

			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("다시 입력해주세요.");

			}
		}
	}

}
