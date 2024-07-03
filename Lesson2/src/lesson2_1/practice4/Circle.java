package lesson2_1.practice4;

public class Circle {
	/*
	 * ★(Circle クラスの仕様) Circle クラスは円の面積を扱うクラスです。 次のフィールド、メソッド、コンストラクタを作成してください。
	 * ・半径の値 radius を double 型で宣言する ・コンストラクタを作成する。 引数：double radius
	 * 処理内容：引数を使ってメンバ変数を初期化する。 ・area 円の面積を求めるメソッドを作成する。 引数：なし 戻り値：double 型 円の面積
	 * 処理内容： フィールドを用いて円の面積を計算する。
	 */
	
	//メンバー変数
	double radius ;

	//コンストラクタを作成する
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//メソッド作成
	double area() {
		return 3.14 * radius * radius;
	}
}
