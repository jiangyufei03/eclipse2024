package Lesson1_1.overload;

public class MethodOverLoadDemo1 {

	public static void main(String[] args) {
		// 认识方法重载，并掌握应用场景
		// 只要方法名称（返回值也要相同），形参列表不同就是方法重载
		
		test();
		test(100);
		
	}

	
	public static void test() {
		System.out.println("------test1------");
	}
	
	public static void test(int a) {
		System.out.println("---------test2-------" + a);
	}
	
	int test(int a, int b) {
		return a + b;
	}
	

}
