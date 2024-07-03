package lesson2_1.use_constructor;

public class Cat {

	String name;
	int age;
	
//	//コンストラクタ
//	//引数なくてもいい
//	Cat(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
	
	
	//コンストラクタ
	public Cat(String name, int age) {
		this.name = name;
		//name = name_;
		this.age = age;
	}

	//鳴く
	void meow() {
		System.out.println("ニャー");
	}

	
}
