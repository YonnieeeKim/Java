package ex_231020.cafe;


public class GradesProgramming {
	public static void main(String[] args) {
		int score[][]=new int[][] {{90,75,61},{55,56,46},{90,90,90}};
		String name[] = new String[] {"홍길동","김철수","이진희"};
		int sum[] = new int[3];
		double avg[]=new double[3];
		String grade[] = new String[3];
		String pass[] = new String[3];
		int rank[] = new int[3];
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				sum[i]+=score[i][j];
			}
			avg[i]=sum[i]/3.0;
			if(avg[i]>=90) {
				grade[i]="A";
				pass[i]="pass";
			}
			else if(avg[i]>=80) {
				grade[i]="B";
				pass[i]="pass";
			}
			else if(avg[i]>=70) {
				grade[i]="C";
				pass[i]="pass";
			}
			else if(avg[i]>=60) {
				grade[i]="D";
				pass[i]="pass";
			}
			else {
				grade[i]="F";
				pass[i]="nopass";
			}
		}
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
					if(avg[i]<avg[j])
						rank[i]++; 
				}
			
		}
			
		
		System.out.println("성적 프로그램");
		System.out.println("===========================================================================");
		System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t재수강\t순위\n")
		;
		System.out.println("===========================================================================");
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d\t%s\t",i+1,name[i]);
			for (int j=0;j<score[i].length;j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("%d\t%.2f\t%s\t%s\t%d\n",sum[i],avg[i],grade[i],pass[i],rank[i]+1);
		}
		
		
	}
}
