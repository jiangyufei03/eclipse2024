package interface_ex.ex1;

public interface A {
	//成员变量（默认为常量）
	//常量需要赋初始值(默认加上了public static final）
//	public static final String schoolName ="peking";
	//常量名字大写，用下划线连接
	String SCHOOL_NAME ="peking";
	
	//定义成员方法（默认为抽象方法：不能写方法体）
	//can not have boddy.
	//public abstract void test();
	void test();
	
//	Interfaces cannot have constructors
//	接口中不能有构造器，不能创建对象
//	public A () {
//	}
}
