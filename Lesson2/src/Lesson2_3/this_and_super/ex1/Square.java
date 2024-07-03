package Lesson2_3.this_and_super.ex1;

public class Square extends Rectangle{

	//コンストラクタ
	public Square(double height) {
		//和父类的有参构造器的引数必须一致
		super(height, height);
	}

	//オーバーライド
	@Override
	public void display() {
		System.out.println("正方形の計算結果です。");
		super.display();
		
	}

	
}
