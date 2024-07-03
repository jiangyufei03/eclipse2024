package Lesson2_2.extends_ex.practice1;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成（メンバー変数すべて注意)
		Cat alice = new Cat("Alice", 5, "black");
		// 継承しているので、animalのメソッドを呼び出すことができる
		alice.eat("キャットフォード");
		alice.sounds();

		Dog d = new Dog("Bob", 3, "white");
		d.eat("ドッグフォード");
		System.out.println(d.color);

//		住所
		System.out.println(d);

		// ポリモーフィズム（多態性）
//		型が違う
		Animal kitty = new Cat("kitty", 5, "red");
		// color只能用于猫类独有変数，新建的动物类对象不能判断是否为猫类，故不能访问猫类変数
//		System.out.println(kitty.color);
//		猫类中override method だけ使える
		kitty.sounds();
		System.out.println(kitty.name);

		System.out.println("-------------------");		
		
		// ポリモーフィズムのメリット
		Animal[] animals = { 
							new Cat("kitty", 5, "red"), 
							new Dog("bob", 10, "black")
							};

		// for-each(拡張for文)
		for (Animal i : animals) {
			i.sounds();
		}
		
//		interface不能インスタンス（不能创建新对象）
//		Runnable run = new Runnable(); 
		
		System.out.println("-------------------");	
		alice.run();
		d.run();
		
	}

}
