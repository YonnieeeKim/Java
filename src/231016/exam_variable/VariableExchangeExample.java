package exam_variable;

public class VariableExchangeExample {
	//2개의 변수 초기화 후 두 수를 교환하여 출력하는 프로그램

	public static void main(String[] args) {
		//변수명 number1. number2, temp
		int a=0, b=1, temp;
		System.out.println("교환전");
		System.out.println("a="+a+" b="+b);
		temp=b;
		b=a;
		a=temp;
		System.out.println("교환후");
		System.out.println("a="+a+" b="+b);

	}

}