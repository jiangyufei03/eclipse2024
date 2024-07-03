package lesson2_1.object_oriented.ex1;

public class Cat {
	
	//属性（メンバー変数：登場人物に関する情報を保存する箱
	//名前
	String name;
	//年齢
	int age;
	//色
	String color;
	
	//振る舞い（メソッド:行動、手順）
	//食べる
	void eat(String food) {
		System.out.println(food + "を食べます。");
	}	
	
	//鳴く
	void meow() {
		System.out.println("ニャー");
	
	}
}
