package lesson2_1.practice2.copy;

public class Student {
	//メンバー変数
	//名前
	String name;
	//点数
	int score;
	
	//コンストラクタ作成
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//メソッド作成
	void showScore() {
		System.out.println(name + "さんの得点は" + score +  "点です。");
	}
}
