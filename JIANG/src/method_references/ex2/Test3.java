package method_references.ex2;

/*
	目标： 构造器引用（理解语法）
*/
public class Test3 {

	public static void main(String[] args) {
		// 1.创建接口的匿名内部类对象
//		CreateCar cc = new CreateCar(){
//			@Override
//			public Car create(String name, double price) {
//				//创建汽车对象
//				return new Car(name, price);
//			}
//		};
		
		//用lambda表达式进行简化
//		CreateCar cc = (name, price) -> new Car(name, price);
		
		//构造器引用 【接口名 对象 = 实体类名：：new】
		CreateCar cc = Car::new;
			
		//cc调的是重写的create方法
		Car c = cc.create("奔驰", 49.9);
		System.out.println(c);
	}

}

interface CreateCar{
	//返回Car类的汽车对象
	Car create(String name, double price);
	
}

