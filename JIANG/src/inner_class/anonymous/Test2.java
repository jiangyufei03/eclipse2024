package inner_class.anonymous;

public class Test2 {

	public static void main(String[] args) {
		// 掌握匿名类的常见使用场景
		//接口的实现类，本身也是实现对象
		Swimming s1 = new Swimming() {
			@Override
			public void swim() {
				System.out.println("🐕狗游泳飞快");
			}
		};
		
		Swimming s2 = new Swimming() {
			@Override
			public void swim() {
			System.out.println("🐱猫游泳很慢");
			}
		};
		
		//调go方法，开始test
		go(s1);
		
		//不创建对象，直接调用(把实现类对象作为一个参数传给go方法里的形参s)
		go(new Swimming() {
			@Override
			public void swim() {
			System.out.println("🐱猫游泳很慢");
			}
		});
	}



//设计一个方法可以接收swimming接口的一切实现类对象进来参加游泳比赛
	public static void go(Swimming s) {
		System.out.println("开始--------------");
		//找送进来的对象（匿名类）		
		s.swim();
		
	}
}

//猫和狗都要参加游泳比赛
interface Swimming {
	void swim();
}