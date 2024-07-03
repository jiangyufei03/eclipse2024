package lesson2_1.object_oriented.ex2;

public class Main {

	public static void main(String[] args) {
		// インスタンス作成
		// 変数名：bob
		// bobのname：「BOB」,age「3」
		// コンソールに　name, ageを表示してください。
		
		Dog bob = new Dog();
		bob.name = "BOB";
		bob.age = 3;
		System.out.println(bob.name);
		System.out.println(bob.age);
		//メソッドの呼び出し
		bob.eat("ドッグフォード");
		
	}

}
