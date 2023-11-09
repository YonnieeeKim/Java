package ex_231017.example;


import java.util.Scanner;

public class OperationExample {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum = 0;
		System.out.println("두 수를 입력하세요");
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		System.out.println("한 문자를 입력하세요");
		char ch =s.next().charAt(0);
		
		if(ch=='+')sum=num1+num2;
		else if(ch=='-')sum=num1-num2;
		else if(ch=='*')sum=num1*num2;
		else {
			if(num2==0) System.out.println("오류");
			else sum=num1/num2;
		}
		
		System.out.println(sum);
	}

}
