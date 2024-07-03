package Lesson2_2.extends_ex.practice1;

// 追加功能
public class Cat extends Animal implements Runnable{
//	サブクラス（子クラス）
	
	//メンバー変数
	//色
	public String color;

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

//	メソッド（猫独自）
	public void meow() {
		System.out.println("ニャ―");
	}
	
	@Override
	public void sounds () {
		System.out.println("ニャ―と鳴く");
	}
	
	@Override
	public void run() {
		System.out.println("猫が走る");
		
	}

}
