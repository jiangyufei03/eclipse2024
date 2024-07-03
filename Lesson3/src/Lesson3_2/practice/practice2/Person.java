package Lesson3_2.practice.practice2;

public class Person {

	//メンバー変数
	private String name;
	private int age;
	
	//コンストラクタ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
