package block;

public class Student {
	static int number = 80; 
	static String schoolName;
	//静态代码块
	static {
		System.out.println("静态代码块执行了-----");
		schoolName = "beijing";
	}
	//实例变量
	int age;	//age是对象的变量，实例代码块在每次创建对象时执行
	
	//实例代码块
	//每次创建对象时执行实例代码块，并在构造器前执行
	//在实例代码块中为实例变量赋值
	//可以赋值但没有意义，因为所有的对象年龄都会变成18
	{
		System.out.println("实例代码块执行了------");
		age = 18;
		System.out.println("有人创建了对象" + this);
	}
	
	//无参构造器
	public Student() {
		System.out.println("无参数构造器执行了-----");
		
	}
	
	public Student(String name) {
		System.out.println("有参数构造器执行了-----");
		
	}
	
	

}
