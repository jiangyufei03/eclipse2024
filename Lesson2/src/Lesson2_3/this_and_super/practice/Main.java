package Lesson2_3.this_and_super.practice;

public class Main {

	public static void main(String[] args) {
		// Personクラスのインスタンス
		//コンストラクタ（引数なし）きを呼び出す
		Person person = new Person();
		System.out.println(person.name);
		System.out.println(person.age);
	
		System.out.println("------------------");
		
		Student student = new Student("mori", 30, 78);
		student.display();
		
	}

}
