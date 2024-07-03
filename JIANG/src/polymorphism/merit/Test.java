package polymorphism.merit;

public class Test {

	public static void main(String[] args) {
		// 多态的好处
		//好处1：可以实现解耦合，右边对象可以随时切换，后续业务随即改变
		
		People p1 = new Student();
//		People p1 = new Teacher();
		p1.run();
		//p1.test();	//多态下存在的问题：无法直接调用子类的独有功能
		//编译的时候看左边，人，里面没有子类的独有功能，只有run方法		
		
		//强制类型转换(此时p1指向的真实对象是学生)
		Student s1 = (Student)p1;
		//可以调学生的独有功能
		s1.test();
		
		//强制类型转换可能存在的问题：编译阶段有继承或者实现关系就可以强制类型转换
		//但是运行时，可能出现类型转换异常
		//Teacher t1 = (Teacher)p1;	//编译阶段不会报错
		//运行阶段，发现老师不能指向学生对象，故报错 （ ClassCastException ）————类型转换异常
		
		//instanceof 关键字
		//如果现在指向的是学生		
		if(p1 instanceof Student) {
			//把 p 强转成学生
			Student s2 = (Student)p1;
			s2.test();
		}else if (p1 instanceof Teacher){
			Teacher t2 = (Teacher)p1;
			t2.teach();
		}
		
		System.out.println("--------------------");

		//对象回调
		Student s = new Student();
		go(s);	
		
		Teacher t = new Teacher();
		go(t);
		
		
	}
		//好处2：使用父类类型的变量作为形参(引数)，可以接受一切子类对象
		//多个对象共用
		public static void go(People p) {
			p.run();		//通用功能run没有问题
			if(p instanceof Student) {
				Student s = (Student)p;
				s.test();	//独有功能要加判断
			}else {
				Teacher t = (Teacher)p;
				t.teach();
			}
		
		}

}
