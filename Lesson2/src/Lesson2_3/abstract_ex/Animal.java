package Lesson2_3.abstract_ex;

public abstract class Animal {

	//メンバー変数
	protected String name;

	//コンストラクタ
	public Animal(String name) {
		this.name = name;
	}
	
	//メソッド
	//処理内容：　name + "make sounds"
	public void sounds() {
		System.out.println(name + " make sounds");
	}
	
	//未実装のメソッド(抽象メソッド)
	public abstract void eat(String food) ;
}
