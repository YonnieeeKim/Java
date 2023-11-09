package ex_231030.phone_info;

import java.util.Scanner;

public class PhoneBookManager {
	static Scanner keyboard = new Scanner(System.in);
	private String name, phone, birth;
	private int i, j, k;
	private PhoneInfo info;
	private PhoneInfo[] phin;

	public PhoneBookManager() {
		phin = new PhoneInfo[100];
	}

	public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.println("선택 : ");

	}

	public void inputData() {

		while (true) {

			System.out.print("이름 : ");
			name = keyboard.nextLine();

			for (i = 0; i < k; i++) {
				if (name.equals(phin[i].getName())) {
					System.out.println("중복저장은 불가능합니다.");
					return;
				}
			}

			System.out.print("전화번호 : ");
			phone = keyboard.nextLine();

			System.out.print("생년월일 : ");
			birth = keyboard.nextLine();

			if (birth.equals(""))
				birth = null;

			info = new PhoneInfo(name, phone, birth);
			phin[k++] = info;
			System.out.println("데이터 입력이 완료되었습니다.");
			return;

		}

	}

	public void findData() {
		System.out.println("데이터 검색을 시작합니다.");
		System.out.println("이름 : ");
		name = keyboard.nextLine();

		for (i = 0; i < k; i++) {
			if (name.equals(phin[i].getName())) {
				phin[i].showInfo();
				System.out.println("데이터 검색이 완료되었습니다.");
				break;
			}
		}
		if (i == k)
			System.out.println("데이터가 없습니다.");

	}

	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.println("이름 : ");
		name = keyboard.nextLine();

		for (i = 0; i < k; i++) {
			if (name.equals(phin[i].getName())) {
				j = i;
			}
		}
		for (i = j; i < k - 1; i++) {
			phin[i] = phin[i + 1];
		}
		phin[k] = null;
		k--;
		System.out.println("삭제가 완료되었습니다.");
	}

}
