package exam_array_in_array;

public class ArrayInArraySum {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 10, 10, 10, 10, 0 }, { 30, 30, 30, 30, 0 }, { 40, 40, 40, 40, 0 }, { 50, 50, 50, 50, 0 }, { 0, 0, 0, 0, 0 } };
		int col = 4;
		int sum = 0;
		System.out.println("실행전");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				if (i == j)
					arr[arr.length-1][arr.length-1]+=arr[i][j];
			
				arr[i][arr.length-1] += arr[i][j];
				arr[arr.length-1][i] += arr[j][i];

			}
		}

		System.out.println("실행후");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
