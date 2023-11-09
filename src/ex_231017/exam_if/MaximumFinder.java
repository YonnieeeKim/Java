package ex_231017.exam_if;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("세개의 수를 입력하세요.");
		int i = s.nextInt();
		int j = s.nextInt();
		int k = s.nextInt();
		
		int max=0;
		
		if(i>j) max=i;
		else max=j;
		if(max<k) max=k;
		
		
		
		System.out.println(max);
		s.close();
		
	}

}
