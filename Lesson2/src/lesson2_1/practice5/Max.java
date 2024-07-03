package lesson2_1.practice5;

public class Max {

	public static void main(String[] args) {
		// 呼び出す
		int max = findMax(12, 8);
		System.out.println("大きい方の数：　" + findMax(12, 8));

	}

	// メソッド作成（main方法外写方法）
	static int findMax(int a, int b){
			return Math.max(a,b);
		
	}
}


