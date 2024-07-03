package static_attection;

public class Student {
		// 1，类方法中可以直接访问类的成员，不可以直接访问实例成员
	
	
	static String schoolName;    //类变量,类成员（用static修饰）
	double score;      //实例变量
	
	//类方法
	public static void printHelloWorld(){
		//同一个类中访问类成员可以省略类名不写
		Student.schoolName = "aoi";       //类名.方法访问
		Student.printHelloWorld2();
		schoolName = "aoi2";
		printHelloWorld2();
		
		//System.out.println(score);     //会报错
		//printPass();					 //会报错
		//System.out.println(this);		//会报错,this需要拿到当前对象
	}
	
	//类方法
	public static void printHelloWorld2() {
		
	}
	
	//2，实例方法中既可以访问类成员，也可以访问实例成员
	//实例方法(不用static修饰)
	//3，实例方法中可以出现this关键字，类方法中不可
	public void printPass() {
		schoolName = "kuma";  //访问类成员
		printHelloWorld2();   //访问；类方法
		
		System.out.println(score);
	//用对象调实例方法，score访问对象的成绩
		
		printPass2();     //实例方法可以调实例方法
		
		System.out.println(this);
		//哪个对象调这个方法，this就会指向哪个对象
	}
	
	public void printPass2() {
		
	}
	
	}


