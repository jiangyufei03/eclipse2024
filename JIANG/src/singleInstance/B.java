package singleInstance;

public class B {
	//2、定义一个类变量来存储这个类的一个对象
	private static B a = new B();	//饿汉式单例
	private static B b;		//懒汉式一开始没有创建对象
	
	//1、把类的构造器私有
	private B() {
	}
	
	//3、定义一个类方法，这个方法要保证第一次调用时才创建一个对象
	//后面调用时候都会用着这同一个对象返回
	//				getInstance ——— 返回一个单例对象
	public static B getInstance() {
		//如果b里面没对象，就代表是第一次来拿对象
		if(b == null) {
			System.out.println("第一次创建对象");
			b = new B();	//创建一个变量交给b记住。第二次进来时：b不是null，把第一次记住的值返回去
		}
		//在if之外把b返回
		return b;
	}

}
