package practice.ex1;

public class Main {

	public static void main(String[] args) {
		//インスタンス
		Student student = new Student("Taro", 20, "20230001");
		student.introduce();
		student.run();
		
		Car car = new Car("Toyota");
		car.run();
		System.out.println("The brand name of the car is "+ car.getBrand() + ".");
	}

}
