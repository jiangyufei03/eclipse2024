package lesson1_3.foreach_statement;

public class Ex1 {

	public static void main(String[] args) {
		// 一次元配列
		int [] array = {20,30,40};
		//拡張
		for (int a : array) {
			System.out.println(a);
		}
		
		String pref[] = { "北海道", "東京都", "神奈川県" };
		for (String str : pref) {
			System.out.println(str);
		}
	}

}


