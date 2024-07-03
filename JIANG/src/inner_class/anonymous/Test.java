package inner_class.anonymous;

public class Test {

	public static void main(String[] args) {
		// 认识匿名内部类，并掌握其作用
//		Animal a = new Cat();
//		a.cry();
		
		//直接得到子类对象
		//匿名内部类
		//1.把这个匿名内部类编译成子类（本身就是Animal的一个子类），然后会立即创建一个子类对象出来		
		Animal a = new Animal() {
			@Override
			public void cry() {
				System.out.println("喵喵喵地叫");
			}
		};
		a.cry();
	}
	
}

//子类
//class Cat extends Animal{
//	@Override
//	public void cry() {
//		System.out.println("喵喵喵地叫");
//	}
//}


//父类
abstract class Animal {
	public abstract void cry();
	
}