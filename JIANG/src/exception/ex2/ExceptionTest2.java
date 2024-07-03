package exception.ex2;


public class ExceptionTest2 {
	// 掌握自定义异常，以及异常的作用
	public static void main(String[] args) {

		//上面抓住异常
		try {
			saveAge(223);
			System.out.println("底层执行成功");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("底层出现了bug");
		}
		
		//saveAge2(256);	//立马提示异常
		
		try {
			saveAge(25);
			System.out.println("saveAge2底层执行成功");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("saveAge2底层出现了bug");
		}
		
	}

	//throws 用在方法上，抛出方法内部的异常
	public static void saveAge2(int age) throws AgeIllegalException {
		if (age > 0 && age < 150) {
			System.out.println("年龄被成功保存：" + age);
		}else {
			//用一个异常对象来封装这个问题
			//自定义编译时异常，写出来的时候就会报错			
			throw new AgeIllegalException("/age is illegal, your age is " + age);
			
		}
	}
	
	
	
//	保存一个合法的年龄
	public static void saveAge(int age) {
		if (age > 0 && age < 150) {
			System.out.println("年龄被成功保存：" + age);
		}else {
			//用一个异常对象来封装这个问题
			//throw 抛出去这个异常对象
			throw new AgeIllegalRuntimeException("/age is illegal, your age is " + age);
			
		}
	}
}
