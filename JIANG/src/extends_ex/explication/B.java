package extends_ex.explication;

//B继承A，	B：子类	A：父类
public class B extends A{
	public int k;
	//子类可以继承父类的非私有成员（成员变量和成员方法）	继承：能用。子类能直接用父类非私有的成员
	public void print3() {
		System.out.println(i);	//直接访问i不报错。如果把继承去掉，则不能访问
		print1();
		
		//System.out.println(j);
		//print2();
		
	}


}
