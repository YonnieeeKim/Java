package ex_231025.exam_array;

import java.util.Scanner;

public class ArrayTransmission {
	public static void main(String[] args) {

		int[] array=new int[5];
		getData(array);
		getAverage(array);

	}

	private static void getData(int[] array) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		s.close();
	}

	private static void getAverage(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("평균 성적은 "+sum/arr.length+"입니다.");
	
	}


}
