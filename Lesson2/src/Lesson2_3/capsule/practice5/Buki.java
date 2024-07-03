package Lesson2_3.capsule.practice5;

public class Buki implements Item {
	
	//メンバー変数
	private String name;
	private int value;
	
	//コンストラクタ
	public Buki(String name, int value) {
		this.name = name;
		this.value = value;
	}

	//method
	@Override
	public void use() {
		System.out.println(name + "で攻撃！");
		System.out.println("敵に" + value + "のダメージ！");
		
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}
	
	
}
