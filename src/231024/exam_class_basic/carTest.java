package exam_class_basic;

public class carTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		//myCar.carData(0, 1, "red");
		myCar.setSpeed(-20);
		myCar.setGear(1);
		myCar.printData();
		System.out.println(myCar.toString());
		System.out.println();
		
		Car yourCar = new Car();
		yourCar.carData(30, 3, "black");
		

		yourCar.speedDown(10);
		yourCar.printData();
		System.out.println(yourCar.toString());
		System.out.println();

	}

}
