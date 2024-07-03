package Lesson2_3.capsule.practice6;

public class Coupon {

	//メンバー変数
	private String name;
	private double rate;
	
	//コンストラクタ
	public Coupon(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}
	
	//メソッド
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		if(rate > 0 && rate < 1) {
		this.rate = rate;
		}
	}
	
}
