package lesson2_1.practice4;

public class Main {

	public static void main(String[] args) {
		/*
		 * ★(Main クラスでの処理) 2つインスタンスを作成する。下記を引数として渡す。 1つ目のインスタンス作成：半径 = 2.0
		 * 1つ目のインスタンス作成：半径 = 10.0
		 * 
		 * 円の面積を求めた結果をコンソールに表示してください。
		 */
		
		//半径 = 2.0
		Circle r1 = new Circle(2.0);
		double rs1 = r1.area();
		//面積を出力
		System.out.println("円の面積は：　" + rs1);
		
		//半径 = 10.0
		Circle r2 = new Circle(10.0);
		double rs2 = r2.area();
		//面積を出力
		System.out.println("円の面積は：　"  + rs2);
		
		
	}

}
