package Lesson2_2.extends_ex.practice2;

public class Rectangle implements Shape{
	//メンバ変数
	double width;
	double height;
	
	//コンストラクタ作成
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//メソッドをオーバーライド
	@Override
	public double getArea() {
		return width * height;
	}
}
