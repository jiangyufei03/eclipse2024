package lesson2_1.static_ex.not_static;

public class Cat {
	/*
	 * Staticが付いているものは、staticが付いているものしか呼び出せない
	 * staticが付いていないものは、staticが付いているものも付いていないものも呼び出せる
	 * static 修饰的是类方法，和类变量
	 * 没有static、修饰的是实例方法和实例变量
	 * static修飾子が付いていない変数のことをインスタンス変数
	 * 实例方法可以调类方法和类变量
	 * 类方法不可以调没有被static修饰的实例方法和实例变量
	 */
	
	
	//staticの付いていないメンバ変数を追加
	//staticの付いていないメンバ変数:	インスタンスを作成する必要がある
	String name;
	
	
	//staticを付けると、 クラス変数になる
	//static変数が共有できるため、便利で、利用されています
	//static変数はインスタンスを生成せずに、クラス名を使ってアクセスできます。
	//类变量所有人都可以使用，以使用的最新变化为准
	static int counter = 0;
	
	Cat(){
		counter++;
//		System.out.println(counter);
		this.name = name;
	}

	//鳴くメソッド
	//static が付いていないメソッド　=== インスタンス化必要
	void meow() {
		//staticが付いいている変数
		System.out.println(counter);
		//staticが付いていない変数
		System.out.println(name);
	}
	
	//表示メソッド
	//staticが付いているメソッド
	static void display() {
		//staticが付いている変数
		System.out.println(counter);
		//staticが付いていない変数をよびだすことができない
		//System.out.println(name);
	}
	
}	


