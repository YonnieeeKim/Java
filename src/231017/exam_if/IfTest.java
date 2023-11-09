package exam_if;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		int i = s.nextInt();
		int j = s.nextInt();
		int temp;
		
		if(i>j) {
			temp=i;
			i=j;
			j=temp;
		}
		System.out.println(i+", "+j);
		
		s.close();
	}

}
