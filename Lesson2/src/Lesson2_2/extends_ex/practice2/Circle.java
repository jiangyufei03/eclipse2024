package Lesson2_2.extends_ex.practice2;

public class Circle implements Shape{
	
	//メンバ変数
	double radius;
	
	//コンストラクタ作成
	public Circle(double radius) {
		this.radius = radius;
	}

	//メソッドをオーバーライド
	@Override
	public double getArea() {
		return 3.14 * radius * radius;
		
	}
	

}
