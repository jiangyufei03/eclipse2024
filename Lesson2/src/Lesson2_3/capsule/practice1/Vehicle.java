package Lesson2_3.capsule.practice1;

public class Vehicle {

	private String brand;
	protected int speed;
	
	//コンストラクタ
	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	
	//メソッド
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String band) {
		this.brand = band;
	}
	
	public int accelerate(int amount) {
		return speed + amount;
	}
//	public void accelerate(int amount) {
//		return += amount;
//	}
	
	public int  brake(int amount) {
		return speed - amount;
	}
//	public void brake(int amount) {
//		return -= amount;
//}
}
