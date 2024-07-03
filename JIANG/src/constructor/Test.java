package constructor;

public class Test {

	public static void main(String[] args) {
		// 认识构造器，并掌握构造器的特点，应用场景，注意事项
		
		//创建（学生）对象的时候，根据右边的小括号决定选择哪个构造器执行
		//小括号内没有参数，此时调用无参数构造器		
		Student s = new Student();
		s.name = "mori";
		s.score = 70;
		
		System.out.println("-------------------------");
		
		//创建对象的同时，对对象的成员变量进行初始化赋值
		Student s1 = new Student("aoi",60);
		//已经被赋值成功
		System.out.println(s1.name);
		System.out.println(s1.score);
		
		//设计类的时候如果不写构造器，java会自动生成一个无参构造器
		Teacher t = new Teacher();
		//一旦定义了一个有参数构造器，便不会自动生成无参数构造器
		//	（因此上述代码会报错）,手写有参构造器后则无事
		
	}

}
