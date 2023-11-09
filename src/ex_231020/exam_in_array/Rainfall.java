package ex_231020.exam_in_array;


public class Rainfall {
	public static void main(String[] args) {
		double rain[][] = new double[][] { { 368.1, 586.5, 351.2, 66.5,0 }, { 173.9, 493.0, 448.4, 168.1,0 }, { 172.8, 1012.4, 259.4, 46.7,0 } };
		double sum = 0;
		final int YEARS = 3;
		final int QUARTERS = 5;


		for (int y = 0; y < YEARS; y++) {
			for (int q = 0; q < QUARTERS-1; q++) {
				rain[y][QUARTERS-1]+=rain[y][q];;
			}
			System.out.printf("%.1f\t\n", sum);
		}
		
		String[] year = {"2018","2019","2020"};
		String[] subject= {"년도","1분기","2분기","3분기","4분기","총합"};
		for(String sub:subject) {
			System.out.printf("%s\t",sub);
		}
		System.out.println("\n--------------------------------------------");
		for(int y=0;y<YEARS;y++) {
			System.out.print(year[y]+"년도\t");
			for(int q=0;q<QUARTERS;q++) {
				System.out.printf("%.1f\t",rain[y][q]);
			}
			System.out.println();
		}
	}
}
