package Lesson1_1.overload;

public class MethodTest2 {

	public static void main(String[] args) {
		//掌握方法重载的应用场景
		fire();
		fire("c国");
		fire( "k国", 3);

	}

	public static void fire() {
		fire("A国");
		//System.out.println("默认给A国发射了一枚武器");
		
	}
	
	public static void fire(String country) {
		fire(country, 1);
		//System.out.println("发射了一枚武器给" + country);
	}
	
	public static void fire(String country, int num) {
		System.out.println("发射了" + num + "枚武器给" + country );
	}
	
}
