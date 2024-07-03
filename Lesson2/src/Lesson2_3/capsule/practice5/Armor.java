package Lesson2_3.capsule.practice5;

public class Armor implements Item {

	//メンバー変数
	private String name;
	private int value;
	
	//コンストラクタ
	public Armor(String name, int value) {
		this.name = name;
		this.value = value;
	}

	//メソッド
	@Override
	public void use() {
		System.out.println(name + "を身に着けた");
		System.out.println("守備力が" + value + "上がった");
		
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}
	
	
}
