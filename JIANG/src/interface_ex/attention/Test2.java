package interface_ex.attention;

public class Test2 {

	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.run();
		
	}
}

//1.一个接口继承多个接口,如果多个接口中存在方法签名冲突,则此时不支持多继承
interface I {
	void test1();
}
interface J {
	String test1();
}
//方法名冲突
//interface K implements I, J{}

//2.一个类实现多个接口,如果多个接口中存在方法签名冲突,则此时不支持多实现
//class E implements I, J{}  

//3.一个类继承了父类，又同时实现了接口,父类和接口中存在同名的默认方法,实现类会优先用父类的
class Fu{
	public void run() {
		System.out.println("父类的run方法执行了");
	}
}

interface IT{
	default void run() {
		System.out.println("接口IT中的run方法执行了");
	}
}

class Zi extends Fu implements IT{
	
}

//4.一个类实现了多个接口，多个接口中存在同名的默认方法，这个类重写该方法即可
interface It1{
	default void test() {
		System.out.println("It1");
	}
}

interface It2{
	default void test() {
		System.out.println("It2");
	}
}

class N implements It1, It2{

	@Override
	public void test() {
		System.out.println("自己的");
		
	}
	
}

