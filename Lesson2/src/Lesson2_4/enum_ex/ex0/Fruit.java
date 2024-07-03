package Lesson2_4.enum_ex.ex0;

public enum Fruit {
	//也可以直接创建enum文件
	//定数は必ず大文字、アンダースコア（_）で区切る
	APPLE, ORANGE, CHERRY;
	
	public static void main(String[] args) {
		switch(Fruit.ORANGE) {
		case APPLE:
			System.out.println(APPLE + "はおいしい");
			break;
		case ORANGE:
			System.out.println(ORANGE + "はおいしい");
			break;
		}
	}


}


