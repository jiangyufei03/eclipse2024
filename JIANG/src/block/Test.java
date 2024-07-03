package block;

public class Test {

	public static void main(String[] args) {
		// 目标：了解两种代码块的特点和基本作用
		
		//用类名.类变量访问
		//加载学生类时，静态代码块同时执行一次（但只执行一次）
		System.out.println(Student.number);
		System.out.println(Student.number);
		System.out.println(Student.number);
		
		
		//为类的类变量进行初始化赋值
		System.out.println(Student.schoolName);  //beijing
		
		System.out.println("----------------------------------");
		
		//先执行实例代码块，再执行无参构造器
		Student s1 = new Student();
		
		System.out.println("----------------------------------");
		
		Student s2 = new Student("张三");
		
		System.out.println("----------------------------------");
		
		System.out.println(s1.age);
		System.out.println(s2.age);
				
		
	}

}
