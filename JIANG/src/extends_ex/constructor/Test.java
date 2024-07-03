package extends_ex.constructor;

class F {
	//无参构造器
//	public F() {
//		System.out.println("---父类F的 无参数构造器 执行了---");
//	}
//}
	
	//有参数构造器(如果父类没有无参构造器，子类的全部构造器会报错）
	public F(String name, int age) {
	}

class Z extends F{
	public Z() {
		//super();	//第一行默认存在super调用父类的无参构造器
		//手写super指定调用父类的有参构造器	
		super("Bob", 17);
		System.out.println("---子类Z的 无参数构造器 执行了---");
	}
	
	public Z(String name) {
		super("Tom", 15);
		System.out.println("---子类Z的 有参数构造器 执行了---");
	}
		
	}
}

public class Test {

	public static void main(String[] args) {
		//子类的全部构造器：先调用父类的构造器，再执行自己
		
//		Z z = new Z();	//子类的无参构造器先调用父类的构造器，再执行自己的构造器
//		Z z2 = new Z("波妞");//子类的有参构造器也先调用父类的构造器，再执行自己的构造器
		
	}

}
