package Lesson2_2.extends_ex.practice1;

public class Animal {
//親クラス（スーパークラス）
	//メンバー変数
	//名前
	protected String name;
	//年齢
	protected int age;
	
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//食べるメソッド
	public void eat(String food) {
		//foodを食べます
		System.out.println(food + "を食べます");
	}
	
	public void sounds () {
		System.out.println("鳴く");
	}
	
	
	
}