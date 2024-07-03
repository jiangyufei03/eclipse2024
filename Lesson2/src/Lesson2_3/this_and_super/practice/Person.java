package Lesson2_3.this_and_super.practice;

public class Person {

	//メンバー変数
	protected String name;
	protected int age;
	
	
	//有参构造器
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//无参构造器	
	public Person() {
		//this必须写在第一行
		this("noname", 1);
	}
	
	//振る舞い
	public void display() {
		System.out.println("person");
	}
	
}
