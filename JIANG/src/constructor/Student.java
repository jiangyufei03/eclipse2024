package constructor;

public class Student {
	//声明成员变量
	String name;
	double score;
	
	//构造器（名字与类名相同），不能写返回值类型
	//无参数构造器		
	public Student(){
		System.out.println("无参数构造器被触发执行");
	}

	//构造器可以充载（形参列表不同）
	//有参数构造器	
	public Student(String name,double score){
		System.out.println("有参数构造器被触发执行");
		this.name = name;
		this.score = score;
	}
	
	
//	创建对象时候，对象会调构造器执行
//	创建对象的时候，可以顺手指定对象来调哪个构造器
	
//	构造器的常见应用场景：创建对象时，同时完成对对象成员变量（属性）的初始化赋值
	
	
	
}
