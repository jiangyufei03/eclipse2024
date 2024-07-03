package extends_ex.visit;

public class Z extends F{
	//子类成员变量name（名字冲突时）	
	String name = "子类名称";
	
	public void showName() {
		//局部变量：name
		String name = "局部名称";
		System.out.println(name);
		//this当前对象
		System.out.println(this.name);//指定访问子类成员变量name
		System.out.println(super.name);//父类成员变量
	}

	//方法重写
	@Override
	public void print1() {
		System.out.println("---子类的print1方法执行了---");
	}
	
	public void showMethod() {
		print1();//就近选择方法
		super.print1();//通过super指定访问父类的方法
		
	}
}
