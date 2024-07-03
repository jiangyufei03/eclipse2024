package Lesson2_3.abstract_ex;

public class Main {

	public static void main(String[] args) {
		//インスタンスできない
//		Animal animal = new Animal("animal");
		
		//インスタンス
		Cat bob = new Cat("Bob", "yellow");
		bob.eat("キャットフォード");
		bob.sounds();
		
	}

}
