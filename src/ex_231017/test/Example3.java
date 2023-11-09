package ex_231017.test;


import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		// 수량,단가 입력받아 금액 계산 후 25%할인해
		// 원래금액, 할인액, 지불 금액 출력
		Scanner s = new Scanner(System.in);
		
		System.out.println("수량,단가를 입력하세요.");
		int quantity = s.nextInt();
		int price = s.nextInt();
		int pay = quantity * price;

		System.out.println("원래금액 : " + pay);
		System.out.println("할인액 : " + (int)(pay * 0.25));
		System.out.println("지불 금액 : " + (int)(pay * 0.75));

		
		s.close();

	}

}
