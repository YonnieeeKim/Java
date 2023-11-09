package ex_231020.cafe;

import java.util.Scanner;

public class Kwibawibo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] a = new String[]{"가위", "바위", "보"};
		int inputOfUser;
		int inputOfComputer;
		
		while(true) {
			System.out.println("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요.");
			inputOfUser=s.nextInt();
			inputOfComputer = (int) (Math.random()*4);
			if (inputOfUser==4) break;
			System.out.println("컴퓨터는 "+a[inputOfComputer-1]+"를 냈습니다.");
			
				if(inputOfUser==inputOfComputer) {
					System.out.println("비겼습니다.");
				}
				else if (inputOfUser==1) {
					if(inputOfComputer==2) System.out.println("졌습니다");
					else if(inputOfComputer==3) System.out.println("이겼습니다.");
				}
				else if (inputOfUser==2) {
					if(inputOfComputer==1) System.out.println("이겼습니다");
					else if(inputOfComputer==3) System.out.println("졌습니다.");
				}
				else if (inputOfUser==3) {
					if(inputOfComputer==1) System.out.println("졌습니다");
					else if(inputOfComputer==2) System.out.println("이겼습니다.");
				}
				
			}
		
	System.out.println("종료");
	}

}
