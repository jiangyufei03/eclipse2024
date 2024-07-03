package recursion;

public class Recursion {
	//认识递归的形式
	public static void main(String[] args) {
		test1();	//StackOverflowError 栈内存溢出，递归的死循环
	}

	//直接方法递归
	public static void test1() {
		System.out.println("-----test1----");
		test1();	//直接方法递归，方法自己调自己
	}
	
	//间接方法递归
	public static void test2() {
		System.out.println("-----test2----");
		test3();
	}
	
	public static void test3() {
		test2();	//间接递归
	}
}
