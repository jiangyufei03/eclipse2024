package final_ex;

public class Test {
	/*
	 * 常量： （public） static final 修饰的变量为常量（固定的，不能被更改）
	 * 常量的名称建议大写，多个单词用下划线连接
	 */
	
//静态变量 static
	//public static final String schoolName;	//报错，一定要赋值
	public static final String SCHOOL_NAME = "Tianjin";
	
//实例变量(必须赋值会导致所有变量名字都为tiger，且不能更改，故很少用)
	private final String name = "tiger";
	
	public static void main(String[] args) {
		// 认识final的作用
		//3.final可以修饰变量，规则：一定要赋值且只能赋值一次		
		/*
		 * 变量： 
		 		一. 局部变量 
		 		二. 成员变量
		 				1.静态成员变量
		 				2.实例成员变量
		 */
		
//不希望此变量被更改时，用final修饰
		final int a;
		a = 12;
//		a = 13;		//第二次赋值会报错。The final local variable a may already have been assigned
		
//		schoolName = "baima";		//第二次赋值会报错
		
//		地址值不能改变，改成null会报错
		final int[] arr = {11, 22, 33};
		arr[0] = 222;	//可以改数据
		
	}
		public static void buy(final double z) {
			// z = 0.1;		//不能在内部进行二次赋值
		}
		
}


//1.final修饰类，这个类就不能被继承了
//工具类会加final修饰
final class A{}
//class B extends A{}

//2.final修饰方法，方法就不能被重写了
class C{
	public final void test() {
		
	}
}

class D extends C{
	//子类不能重写父类中final的方法
//	@Override
//	public void test() {
//		
//	}
}

