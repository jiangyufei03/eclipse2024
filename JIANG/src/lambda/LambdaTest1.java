package lambda;

public class LambdaTest1 {

	public static void main(String[] args) {
		// 认识lambda表达式
		//匿名内部类
//		Animal a = new Animal() {
//			@Override
//			public void run() {
//				System.out.println("狗跑的贼快");
//			}
//		};
//		a.run();
		
		//lambda表达式的使用是有前提的，并不能简化全部匿名内部类的写法
		//只能简化函数式接口（首先是个接口，其次接口内部有且只能有一个抽象方法）的匿名内部类
		//Animal 是类不是接口，所以不能简化
//		Animal a = () -> {
//			System.out.println("狗跑的贼快");
//		};
//		a.run();
		
		
//			@Override
//			public void run() {
//				System.out.println("狗跑的贼快");
//			}
//		};
//		a.run();
		
		//匿名内部类对象
//		Swimming s = new Swimming(){
//			@Override
//			public void swim() {
//				System.out.println("学生快乐的游泳");
//			}
//		};
//		s.swim();
		
		//用lambda表达式简化
		//左边：接口类型的变量来接这个对象
		Swimming s =() -> {
				System.out.println("学生快乐的游泳");
		};
		s.swim();
		
		
		
	}

}

interface Swimming{
	void swim();
}


abstract class Animal{
	public abstract void run();
}