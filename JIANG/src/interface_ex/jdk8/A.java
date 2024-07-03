package interface_ex.jdk8;

public interface A {
	/*
	 * 1.默认方法：必须使用default 修饰，并且默认会被public修饰
	 * 此默认方法为实例方法（对象的方法）可以用对象来访问
	 * 但接口不能创建对象，必须使用实现类的对象来访问
		*/
	
	//可以带方法体的默认方法)(public可以不用写)
	//public default void test1() {
	default void test1() {
		System.out.println("-------默认方法------");
		test2();
	}
	
	/*
	 * 2.私有方法：必须使用private修饰（从JDK 9开始才支持）
	 * 可以带方法体
	 * 也是实例方法，也是对象的方法（但因为是私有，在外面无法用实现类调用）
	 * 但可以在本类内部访问 
	*/
	
	private void test2() {
		System.out.println("-------私有方法------");
	}
	
	/*
	 * 3.静态方法（类方法）：必须使用static修饰
	 * 默认会使用public修饰
	*/
	
	public static void test3() {
		System.out.println("-------静态方法------");
	}
}
