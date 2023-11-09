package example;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int n=s.nextInt();
		
		int i = n / 10;
		n -= i * 10;
		
		if((n==3||n==6||n==9)&&(i==3||i==6||i==9)) 
			System.out.println("박수짝짝");
		else if(n==3||n==6||n==9)
			System.out.println("박수짝");
	}

}
