package Lesson2_2.extends_ex.ex1;

public class Car extends Vehicle{

//	コンストラクタ作成
	public Car(String brand) {
		super(brand);
	}

//	振る舞い
	void drive () {
		System.out.println("car is driving");
		
		
	}


}
