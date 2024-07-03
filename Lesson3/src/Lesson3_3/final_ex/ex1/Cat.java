package Lesson3_3.final_ex.ex1;

public class Cat {
	private final String name ;
//	private final String name = "Alice";
	
	//必ず宣言したときに、値を代入.必ず初期化
//	public final static int TEST;
	public final static int TEST = 1;

//	値を入る確約
	public Cat(String name) {
		this.name = name;
	}
	
	//构造器，上面没有赋值，全部的构造器中必须都要赋值，只要出现
	public Cat() {
		this.name = "Bob";
//		上面代码如果注释起来就会出错
	}
}

