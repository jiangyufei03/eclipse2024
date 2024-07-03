package Lesson2_2.extends_ex.practice3;

public class Student extends Person implements Subject{
	
	//コンストラクタ作成
	Student (String name, int age){
		super(name, age);
	}
	
	//メソッドのインタフェース
	public void study() {
		System.out.println(name + "が勉強中です。");
	}
}
