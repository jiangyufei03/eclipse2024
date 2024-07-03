package lesson1_2.practice;

public class Practice2 {

	public static void main(String[] args) {
		
		// ★問題1
		// 変数名 hobby 値：読書 初期化してください
		// 変数名 readTime 値：2.5(doubleを使用）初期化してください
		// コンソールに表示
		// 実行結果
		// 「私の趣味は読書で2.5時間を使って趣味を楽しみます」

		
		String hobby = "読書";
		double readTime = 2.5;
		System.out.println("私の趣味は" + hobby + "で" + readTime + "時間を使って趣味を楽しみます。");
		
		
		
		
		// ★問題2
		// 配列変数 scores 値：44,55,77でscoresを初期化してください
		// コンソールに表示
		// 実行結果
		// 「私の数学の点数は77」
		
		int[] scores = {44,55,77};
		System.out.println("私の数学の点数は" + scores[2]);
	}
}
