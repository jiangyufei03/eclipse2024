package lesson2_1.use_constructor;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成
		Cat bob = new Cat("BOB", 5);
		bob.name = "Alice";
		//コンソールに表示
		System.out.println(bob.name);
		System.out.println(bob.age);
	}

}
