package inner_class.ex1;

public class Test {

	public static void main(String[] args) {
		// 了解成员内部类
		
		Outer.Inner in = new Outer().new Inner();
		in.test();
		

	}

}
