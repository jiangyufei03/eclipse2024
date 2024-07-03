package Lesson2_4.enum_ex.ex1;

public enum Fruit {
	//設計書としてsimple
	APPLE("りんご"), ORANGE("オレンジ"), CHERRY("さくらんぼ");
	
	// 定数の説明（和名）を格納するためのメンバ変数
	private String fruitName;

	//コンストラクタ	
	private Fruit(String fruitName) {
		this.fruitName = fruitName;
	}

	//ゲッター
	public String getFruitName() {
		return fruitName;
	}
	
	
	
	
}
