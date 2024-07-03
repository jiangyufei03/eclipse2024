package Lesson2_2.extends_ex.ex1;

public class Vehicle {

	//メンバー変数
	String brand;
	
	//コンストラクタ作成
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	//振る舞い
	void displayBrand() {
		System.out.println("brand: " + brand);
	}
	
}
