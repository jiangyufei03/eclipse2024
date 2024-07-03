package extends_ex.feature;

public class Test {

	public static void main(String[] args) {
		// 目标：掌握继承的两个注意事项
		//1、java是单继承的，一个类只能继承一个直接父类，java中的类不支持多继承，但支持多层继承
		//2、Object类是所有类的祖宗
		
		A a = new A();
		a.hashCode();

		//可以调用Object方法
		B b = new B();
		b.hashCode();
	}

}

class A{}// extends Object{}
//可以多层继承
class B extends A{}  //Object类的子孙类
//class C extends B, A{}   //不支持多继承
class D extends B{}
