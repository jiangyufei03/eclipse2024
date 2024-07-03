package week2_jiangyufei.practice1;

public class Rectangle implements Printx {

	//メンバー変数
	protected double height;
	protected double width;
	
	//コンストラクタ
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	//メソッド(类的成员变量已经储存了高度和宽度，无需另传数据)
	protected double getArea() {
		return height * width;
	}
	
	protected double getPerimeter () {
		return  (height + width) * 2;
	}

	@Override
	public void printx() {
		System.out.println(
				"長方形の高さ：" + height
				+ "、幅：" + width
				+ "、面積：" + getArea()
				+ "、周長：" + getPerimeter()
		);
	}
}
