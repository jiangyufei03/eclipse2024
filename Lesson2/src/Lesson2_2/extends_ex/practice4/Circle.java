package Lesson2_2.extends_ex.practice4;

public class Circle  extends Shape implements Printable{
	//メンバー変数
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}

	
//	自動作成
	@Override
	public void print() {
		// 填入代码
		System.out.println("Printing a circle with radius: " + radius);
	}
	
	//メソッド
//	@Override
//	public void print() {
//		System.out.println("Printing a circle with radius: " + radius);
//	}

	
	
}
