package lesson1_3.method.Ex;

public class Ex1 {

	public static void main(String[] args) {
		//main のなかでメソッドを呼び出す　　main= start button
		greeting();
		//一度部品を作成すれば、部品名（メソッド名）を書くだけで何度も呼び出しができる
		greeting();
		
	}
	
	//method　は　main の外で定義
	//挨拶をするメソッドを作成
	static void greeting() {
		//挨拶を表示
		System.out.println("こんにちは！");
	}
	
	
}
