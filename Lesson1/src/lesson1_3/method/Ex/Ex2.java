package lesson1_3.method.Ex;

public class Ex2 {

	public static void main(String[] args) {
		//method を呼び出す
		greeting("Aさん");
		greeting("Bさん");
		
		
		//方法写了参数的时候，必须调用的时候也带，否则会报错
		//greeting()；
		//调用时不一致也会出错
		//greeting(1)；
		
	}

	//挨拶をするメソッドを作成
	static void greeting(String name) {
		System.out.println("こんにちは！" + name );
		
		
	}
}
