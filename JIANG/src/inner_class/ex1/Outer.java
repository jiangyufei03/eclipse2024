package inner_class.ex1;

public class Outer {
	//外部类的成员
	private int age = 99;
	public static String a;

	
//成员内部类
	public class Inner{
		
		//从JDK16开始才可以定义静态成员
		public static String schoolName;
		
		private int age = 88; 
		
		public void test() {
			System.out.println(age);
			System.out.println(a);
			
			int age= 66;
			System.out.println(age);	//66
			//内部类对象的成员变量
			System.out.println(this.age);	//88
			//指定外部成员对象的变量			
			System.out.println(Outer.this.age); //99
		}
		
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void test2(){
			System.out.println(age);
			System.out.println(a);
		}
	}

}
