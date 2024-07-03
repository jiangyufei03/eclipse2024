package inner_class.static_ex;

public class Outer {
	private int age;
	public static String schoolName;
	//静态内部类
	public static class Inner{
		private String name;
		public static int a;
		
		public void test() {
			System.out.println(schoolName);
			//不能访问实例变量，需要对象
			//System.out.println(age);
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
	}
	public void test2() {
		//静态被共享，可以访问
		System.out.println(schoolName);
		
	}
}
