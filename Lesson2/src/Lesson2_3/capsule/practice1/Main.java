package Lesson2_3.capsule.practice1;

public class Main {

	public static void main(String[] args) {
		// Carクラスのインスタンス「myCar」を作成

		Car myCar = new Car("Toyota", 60, 4);

		System.out.println("Brand: " + myCar.getBrand());
		System.out.println("Number of doors: " + myCar.getNumDoors());
		System.out.println("Speed: " + myCar.speed); // speed is protected, so it's accessible in a subclass
		System.out.println("New Speed: " + myCar.accelerate(20));
//		myCar.accelerate(20);
//		System.out.println("New Speed: " + myCar.speed);
		myCar.honk();
	}

}
