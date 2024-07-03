package extends_ex.explication;

public class Test {

	public static void main(String[] args) {
		//认识继承，掌握特点

		B b = new B();
		//b对象(子类对象)此时是用A和B两个类（两张设计图做出来的）
		//b对象能够访问什么成员也是由两张设计图共同决定的
		//（两张设计图对外暴露了什么成员，b对象就可以访问什么成员）	
		
		System.out.println(b.i);
		//可以访问i这个成员变量
//		System.out.println(b.j);
		//不可以访问j
		System.out.println(b.k);
		//可以访问k
		
		b.print1();
//		b.print2();
		b.print3();
		
		
	}

}
