package enum_ex.ex2;

public class Test {

	public static void main(String[] args) {
		// 掌握枚举的应用场景：信息的分类和标志
		//check(1)
		//类名.常量 ———— 访问具体的值
//		check(Constant.BOY);
		//check(21)；	//不存在
		
		check(Constant2.BOY);

	}
	
	public static void check(Constant2 sex) {
		switch(sex) {
		case BOY:
			System.out.println("展示美女图，游戏信息");
			break;
		case GIRL:
			System.out.println("展示帅哥图，宠物信息");
			break;
		}
	}
	

//	public static void check(int sex) {
//		switch(sex) {
//		case Constant.BOY:
//			System.out.println("展示美女图，游戏信息");
//			break;
//		case Constant.GIRL:
//			System.out.println("展示帅哥图，宠物信息");
//			break;
//		}
//	}
}
