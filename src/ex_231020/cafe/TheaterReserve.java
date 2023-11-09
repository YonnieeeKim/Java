package ex_231020.cafe;

import java.util.Scanner;

public class TheaterReserve {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		int[] seat = new int[10];
		int num;
	
		while(true) {
			System.out.print("원하시는 좌석 번호를 입력하세요.(종료는 -1)");
			num=s.nextInt();
			if(num>10)System.out.println("좌석 번호 선택이 잘못되었습니다.");
			else if (num==-1) break;
			
			else if(seat[num-1]==0) {
				seat[num-1]=1;
				System.out.println("예약되었습니다.");
				
			}
			else if(seat[num-1]==1) {
				System.out.println("이미 예약된 자리입니다.");
			}
			
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("----------------------------");
			for(int i =0;i<seat.length;i++) {
				System.out.print(seat[i]+" ");
			}
			System.out.println("\n----------------------------");
		}
		System.out.println("프로그램을 종료합니다.");
	}
	

}
