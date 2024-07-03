package lesson2_1.object_oriented.ex1;

public class Main {

	public static void main(String[] args) {
		// main : start ボタン
		//インスタンス作成
		Cat alice = new Cat();
		//名前
		alice.name = "Alice";
		//年齢五歳
		alice.age = 5;
		//色
		alice.color = "白";
		System.out.println(alice.name);
		//年齢をコンソールに表示
		System.out.println(alice.age);
		System.out.println(alice.color);
		
		//振る舞いの呼び出し
		alice.eat("キャットフォード");
		alice.meow();
	}

}
