package exam_array_in_array;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] arr1 = new int[2][3];

		System.out.println("arr1.length= " + arr1.length);
		System.out.println("arr1[0].length= " + arr1[0].length);
		System.out.println("arr1[1].length= " + arr1[1].length);
		System.out.println();

		for (int i = 0; i < arr1.length; i++) {
			for (int k = 0; k < arr1[i].length; k++) {
				System.out.println("arr1[" + i + "][" + k + "]" + arr1[i][k] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 초기화
		int arr2[][] = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };

		for (int i = 0; i < arr2.length; i++) {
			for (int k = 0; k < arr2[i].length; k++) {
				System.out.printf("%-5d", arr2[i][k]);
			}
			System.out.println();
		}
		System.out.println();

		int arr3[][] = new int[2][];
		arr3[0] = new int[] { 1, 5 };
		arr3[1] = new int[3];

		for (int i = 0; i < arr3.length; i++) {
			for (int k = 0; k < arr3[i].length; k++) {
				System.out.println("arr3[" + i + "][" + k + "]" + arr3[i][k] + " ");
			}
			System.out.println();
		}
		System.out.println();

		
		
		
		int arr4[][] = new int[5][5];
		int sum = 0;
		//배열초기화
		for (int i = 0, num = 1; i < arr4.length; i++) {
			for (int k = 0; k < arr4[i].length; k++) {
				arr4[i][k] = num++;
			}
		}
		//2차원 배열 출력
		for (int i = 0; i < arr4.length; i++) {
			for (int k = 0; k < arr4[i].length; k++) {
				System.out.printf("%-5d", arr4[i][k]);
			}
			System.out.println();
		}
		//합 구하기 (0,0)(1,1)(2,2)(3,3)(4,4)(5,5)
		for (int i = 0; i < arr4.length; i++) {
			for (int k = 0; k < arr4[i].length; k++) {
				if (i == k) {

					sum += arr4[i][k];
				}
			}
		}
		System.out.println("합계 = " + sum);
		
		int arr5[][] = new int[5][5];
		int sum1 = 0;
		//배열초기화
		for (int i = 0, num = 1; i < arr5.length; i++) {
			for (int k = 0; k < arr5[i].length; k++) {
				arr5[i][k] = num++;
			}
			
		}
		//2차원 배열 출력
		for (int i = 0; i < arr5.length; i++) {
			for (int k = 0; k < arr5[i].length; k++) {
				System.out.printf("%-5d", arr5[i][k]);
			}
			System.out.println();
		}
		//합 구하기 (0,0)(1,1)(2,2)(3,3)(4,4)(5,5) 기준 왼쪽 삼각형 내 요소들의 합
		for (int i = 0; i < arr5.length; i++) {
			for (int k = 0; k < arr5[i].length; k++) {
				if (i >= k) {

					sum1 += arr5[i][k];
					//System.out.print(arr5[i][k]+" ");
				}
			}
		}
		System.out.println("합계 = " + sum1);

	}

}
