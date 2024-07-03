package week2_jiangyufei.practice1;

public class Square extends Rectangle implements Printx{

	public Square(double side) {
		super(side, side);
	}

	@Override
	public void printx() {
		System.out.println(
				"正方形の辺の長さ：" + super.width
				+ "、面積：" + super.getArea()
				+ "、周長：" + super.getPerimeter()
		);
	}
	
}
