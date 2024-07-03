package extends_ex.visit;

public class Test {

	public static void main(String[] args) {
		// 子类中国访问其他成员的特点：就近原则
		//先找子类局部范围，而后子类成员范围，而后父类范围寻找		
		
		Z z = new Z();
		//就近原则选择name
		z.showName();
		z.showMethod();

	}

}
