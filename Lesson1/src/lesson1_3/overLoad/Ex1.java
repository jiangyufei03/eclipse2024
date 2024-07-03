package lesson1_3.overLoad;

public class Ex1 {

	public static void main(String[] args) {
		// メソッドを呼び出し
		System.out.println(add(2, 2));
		System.out.println(add(10));

	}

	//2つの整数の値の合計を計算
	static int add (int a, int b) {
		return a + b;
	}
	// 1つの整数の値に1を加算
	static int add (int a) {
		return a + 1;
	}
	
	// 2つの小数の値の合計を計算
	static double add (double a, double b) {
		return a + b; 
	}
	
	//オーバーロードできないパターン
	// 引数の変数名だけが異なっている
//	static int add(int aaa) {
//		return aaa + 1;
//	}
	
	// 戻り値だけが異なっている
//	static double add (int a) {
//		return a;
//	}
	
	static int add() {
		int test = 1 + 2;
		return test;
	}
	
	static void add (int a, double b) {
		int rs = a + (int)b;
	}
	
}
