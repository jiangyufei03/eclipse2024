package polymorphism.ex1;

public class Test {

	public static void main(String[] args) {
		// 认识多态：对象多态，行为多态
		//1.对象多态（人对象可以指向老师对象，也可以指向学生对象）
		//把小范围的老师对象给到大范围的人的变量（没有问题）
		People p1 = new Teacher();
		p1.run();	//识别技巧：编译看左边，运行看右边
		//写代码的时候看左边的大类（People）有没有run方法
		//运行的时候进入到右边的小类（Teacher）中运行
		//真正跑的时候是在个别类中以各种方式进行 ———— 行为多态	
		
		System.out.println(p1.name);
		
		People p2 = new Student();
		p2.run();	//识别技巧：编译看左边，运行看右边（左边父类，右边子类，父类的方法调子类的行为）
		//行为多态 ———— 一定要方法重写（老师重写的和学生重写的）		
		
		System.out.println(p2.name);
		//变量：编译看左边，运行看右边
		//多态强调的是对象和行为多态，变量不讲求多态性
		//编译阶段访问的是谁的，执行的时候访问的就是谁的		

	}

}
