package lesson1_3.method.Ex;

public class Ex3 {

	public static void main(String[] args) {
		//method を呼び出す
		greeting("Aさん", 10);
		greeting("Bさん", 20);
		
		//必须按顺序，否则会报错
		//greeting(10, "Aさん");
	}

	//挨拶をするメソッドを作成
	static void greeting(String name, int age) {
		//こんにちは、名前、年齢
		System.out.println("こんにちは！" + name + " " + "年齢は" + age + "歳です");
		
	}
	
}
