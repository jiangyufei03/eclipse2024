package lesson2_1.practice3;

public class Student {

	//インスタンス変数作成
	//名前
	String name;
	//年齢	
	int age;
	//趣味	
	String hobby;
	
	//コンストラクタ作成	
	public Student(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	//メソッド作成	
	void hello() {
		System.out.println(name + "は" + age + "歳で趣味は" + hobby + "です。");
	}
	
}
