package interface_ex.merit;

public class Test {

	public static void main(String[] args) {
		// 使用接口的好处
		//把A当作student用
		Student a = new A();
		Driver d = new A();
		Singer s = new A();
		s.sing();
		
		//driver实际上是一个接口，用接口调方法————面向接口编程
		Driver m = new A();
		//可以灵活切换实现类对象（干爹和子类）		
		Driver b = new B();
		d.drive();
	}

}

class B implements Driver{

	@Override
	public void drive() {
	}
	
}


class A extends Student implements Driver, Singer {

	@Override
	public void sing() {
	}

	@Override
	public void drive() {
	}
	
}

class Student{
}

interface Driver{
	void drive();
}

interface Singer{
	void sing();
}
