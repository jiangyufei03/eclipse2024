package modifer.ex1;

public class Demo {

	public static void main(String[] args) {
		//掌握不同权限修饰符的作用
		//DateFormat
		//Exception
		
		//缺省修饰符： 可以在本类中访问，也可以在同一包下的其他类访问
		//protected修饰符： 可以在本类、同一包下的其他类、任意包下的子孙类里访问
		//public修饰符： 可以在任意地方访问（本类、同一包下的其他类、子孙类、任意包下的任意类）
		//private < 缺省 < protected < public
		//
		
		//同一包下的其他类
		Fu f = new Fu();
//		f.privateMethod();
		f.method();
		f.protectedMethod();
		f.publicMethod();
				
		
	}

}
