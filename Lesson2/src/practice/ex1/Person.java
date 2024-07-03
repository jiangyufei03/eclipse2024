package practice.ex1;

public class Person {

	//メンバー変数
	protected String name;
	protected int age;
	
	//コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//メソッド
	public void introduce() {
		System.out.println("My name is " + name + ".I am " + age + " years old.");
	}
}
