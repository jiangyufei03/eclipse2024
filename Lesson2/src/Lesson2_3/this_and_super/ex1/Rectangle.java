package Lesson2_3.this_and_super.ex1;

public class Rectangle {

	// 高さ
	protected double height;
	// 幅
	protected double width;
	
	//コンストラクタ
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	//面積を求めるメソッド
	public double getArea() {
		return height * width;
	}

	//周辺の長を求めるメソッド
	public double getPerimeterLength() {
		return (height + width) * 2;
	}
	
	//面積と周辺の長さを出力メソッド
	public void display() {
		System.out.println("面積は：　" + getArea());
		System.out.println("周辺の長さ:　" + getPerimeterLength());
	}
}
