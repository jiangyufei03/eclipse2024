package Lesson2_3.capsule.practice6;

public class Member {
	//メンバー変数
	private String name;
	protected Coupon coupon;
	
	//コンストラクタ
	public Member(String name) {
		this.name = name;
	}
	
	//method
	public int useCoupon(int price) {
		//使用Coupon类的变量调用Coupon类的方法
		return (int)(price * coupon.getRate());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	
}
