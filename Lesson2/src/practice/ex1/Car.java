package practice.ex1;

public class Car implements Runnable{

	//メンバー変数
	private String brand;

	//コンストラクタ
	public Car(String brand) {
		this.brand = brand;
	}
	
	//メソッド
	@Override
	public void run() {
		System.out.println(brand + "cars on the road.");
	}

	//getter,setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
