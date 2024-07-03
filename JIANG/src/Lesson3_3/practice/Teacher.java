package Lesson3_3.practice;

public class Teacher {
	//メンバ変数
	private String name;
	private int age;
	
	//コンストラクタ
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//getteｒ、setter
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

	
	//toString
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	
	
}
