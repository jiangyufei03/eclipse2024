package singleInstance;

public class A {
	
	//饿汉式单例的书写方式
	//特点： 在获取类的对象时，对象已经创建好了
	
	//2.定义一个类变量记记住类的一个对象
	//类变量a属于这个类自己持有，会与类一起加载一次

	private static A a = new A();  //只会执行一次，对象只会创建一个
			
	//1.私有类的构造器(外面不能用这个类创建对象)
	private A() {
	}

	//3.定义一个类方法返回类的对象
	public static A getObject() {
		return a;
	}

}
