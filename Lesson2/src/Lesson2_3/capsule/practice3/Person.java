package Lesson2_3.capsule.practice3;

public class Person {
	
	//メンバー変数
	private String name;
	protected int age;
	
	//コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//メソッド
	public void introduce() {
		System.out.println("名前は：　" + name + "\n" + "年齢は：　" + age );
	}
	
}
