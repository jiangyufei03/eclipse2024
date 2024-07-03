package Lesson2_4.enum_ex.ex1;

public class Main {

	public static void main(String[] args) {
		// 英語を取り出したい場合
		System.out.println(Fruit.APPLE);
		System.out.println(Fruit.ORANGE);
		
		// 和名を取り出したい場合
		System.out.println(Fruit.APPLE.getFruitName());
		System.out.println(Fruit.ORANGE.getFruitName());
		
		//拡張for
		for(Fruit a :Fruit.values()) {
			// 英語を取り出したい場合		// 和名を取り出したい場合
			System.out.println(a + " " + a.getFruitName());

		}
	}

}
