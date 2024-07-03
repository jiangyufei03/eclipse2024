package Lesson2_3.abstract_ex;

public class Cat extends Animal {

	//メンバー変数
	private String color;

	//コンストラクタ
	public Cat(String name, String color) {
		//親クラスの変数
		super(name);
		this.color = color;
	}

	@Override
	public void eat(String food) {
		System.out.println(food + "を食べます");
	}
	
	//
	
}
