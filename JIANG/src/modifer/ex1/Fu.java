package modifer.ex1;

public class Fu {
	//1、私有：只能在本类中访问
	private void privateMethod() {
		System.out.println("---private---");
	}
	
	//2、缺省：本类，同一个包下的其他类
	void method() {
		System.out.println("---缺省---");
	}
	
	//3、protected：本类、同一个包下的其他类、任意包下的子类(子类对象不能访问protected）
	protected void protectedMethod() {
		System.out.println("---protected---");
	}
	
	//4、public：本类、同一个包下的其他类、任意包下的子类、任意包下的任意类
	public void publicMethod() {
		System.out.println("---public---");
	}
	
	
//	写一个方法
	public void test() {
		privateMethod();
		method();
		protectedMethod();
		publicMethod();
	}
}
