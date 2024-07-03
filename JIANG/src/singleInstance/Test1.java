package singleInstance;

public class Test1 {

	public static void main(String[] args) {
		// 掌握单例设计模式的写法
		
		//报错： The constructor A() is not visible
		//new A();
		
		
		//地址相同，对外只会生成一个对象
		A a1 = A.getObject();
		A a2 = A.getObject();
		System.out.println(a1);
		System.out.println(a2);
	}

}
