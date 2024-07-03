package interface_ex.jdk8;

public class Test {

	public static void main(String[] args) {
		// 掌握接口新增的三种方法形式
		B b  = new B();
		b.test1();
		//静态方法属于类本身持有，需要用接口名来调用
		A.test3();
		

	}

}
