package lesson2_1.practice6;

public class Daikei {

	// メンバー変数
	double top;
	double low;
	double height;

	// コンストラクタ作成
	public Daikei(double top, double low, double height) {
		this.top = top;
		this.low = low;
		this.height = height;
	}

	// メソッド作成
	double getArea() {
		return (top + low) * height * 0.5;
	}

}
