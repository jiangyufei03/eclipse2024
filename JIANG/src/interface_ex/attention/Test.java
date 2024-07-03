package interface_ex.attention;

public class Test {

	public static void main(String[] args) {
		// 理解接口的多继承

	}

}

interface A{
	void test1();
}
interface B{
	void test2();
}

interface C{}
interface D extends C, B, A{
	
}

//class E implements C, B, A{
//	
//}

//同等效果
class E implements D{

	@Override
	public void test2() {
		// 要求方法重写
		
	}

	@Override
	public void test1() {

	}
	
}